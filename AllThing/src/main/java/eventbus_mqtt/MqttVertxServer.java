package eventbus_mqtt;

import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.mqtt.MqttEndpoint;
import io.vertx.mqtt.MqttServer;
import io.vertx.mqtt.MqttServerOptions;
import io.vertx.mqtt.MqttTopicSubscription;
import log4j2.LogAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 22/04/2019
 * Time: 1:35 PM
 */
public class MqttVertxServer {
    private final LogAdapter logger = LogAdapter.newInstance(this.getClass());
    private final List<String> listId = new ArrayList();
    private final List<String> listTopic = new ArrayList<>();
    private final HashMap<String, MqttEndpoint> mapEndpoint = new HashMap();
    private String currentTopic = "";
    private Boolean isSend = true;
    private Vertx vertx = Vertx.vertx();


    public static void main(String[] args) {
        new MqttVertxServer().startMqttServer();
    }

    private void startMqttServer() {

        MqttServer mqttServer = MqttServer.create(vertx, new MqttServerOptions().setPort(8234));
        mqttServer.endpointHandler(endpoint -> {
            //
            logger.debug("client identifier: {} and endPoint: {}", endpoint.clientIdentifier(), endpoint);
            endpoint.unsubscribeHandler(handle -> {
                logger.warn("UNSUBSCRIBE: {} {}", endpoint, endpoint.clientIdentifier());
                mapEndpoint.remove(endpoint.clientIdentifier());
            });
            endpoint.disconnectHandler(handle -> {
                logger.warn("DISCONNECT: {} {}", endpoint, endpoint.clientIdentifier());
                mapEndpoint.remove(endpoint.clientIdentifier());
            });

            endpoint.subscribeHandler(subscribe -> {
                List<MqttQoS> grantedQosLevels = new ArrayList<>();
                for (MqttTopicSubscription s : subscribe.topicSubscriptions()) {
                    logger.trace("Subscription for " + s.topicName() + " with QoS " + s.qualityOfService() + " clientId: {}", endpoint.clientIdentifier());
                    grantedQosLevels.add(s.qualityOfService());
                    listTopic.add(s.topicName());
                    currentTopic = s.topicName();
                }
                // ack the subscriptions request
                endpoint.subscribeAcknowledge(subscribe.messageId(), grantedQosLevels);
                mapEndpoint.put(endpoint.clientIdentifier(), endpoint);
                sendMessageToAllClient();
            });
            endpoint.accept();
        }).listen(rs -> {
            logger.info("start mqtt success or not: {}", rs.succeeded());
        });
    }

    private void sendMessageToAllClient() {
        if (isSend) {
            isSend = false;
            vertx.setPeriodic(2000, handle -> {
                for (MqttEndpoint endpoint : mapEndpoint.values()) {
                    if(!endpoint.isConnected()){
                        mapEndpoint.remove(endpoint.clientIdentifier());
                        continue;
                    }
                    endpoint.publish("what_ever", Buffer.buffer("message: " + endpoint.clientIdentifier() + " " + new Date()), MqttQoS.EXACTLY_ONCE, false, false, rs -> {
                        logger.debug("STATUS send: {} to endUser: {}", rs.succeeded(), endpoint.clientIdentifier());
                    }).publishAcknowledgeHandler(messageId -> {
                        //todo what happen ?
                        logger.info("publishAcknowledgeHandler message id: {}", messageId);
                    }).publishReceivedHandler(messageId -> {
                        endpoint.publishRelease(messageId);
                    }).publishCompletionHandler(messageId -> {
                        logger.info("publishCompletionHandler message id: {}", messageId);
                    });
                }
            });
        }
    }

    private void sendMessageToTopic(MqttEndpoint endpoint) {
        endpoint.publish(currentTopic, Buffer.buffer("message: " + endpoint.clientIdentifier()), MqttQoS.EXACTLY_ONCE, false, false, rs -> {
            logger.debug("STATUS: {}", rs.succeeded());
        }).publishAcknowledgeHandler(messageId -> {
            //todo what happen ?
            //logger.info("publishAcknowledgeHandler message id: {}", messageId);
        }).publishReceivedHandler(messageId -> {
            endpoint.publishRelease(messageId);
        }).publishCompletionHandler(messageId -> {
            logger.info("publishCompletionHandler message id: {}", messageId);
        });
    }
}
