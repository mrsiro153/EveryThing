package eventbus_mqtt;

import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.EventBus;
import io.vertx.ext.bridge.BridgeEventType;
import io.vertx.ext.bridge.PermittedOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.ext.web.handler.sockjs.BridgeOptions;
import io.vertx.ext.web.handler.sockjs.SockJSHandler;
import io.vertx.mqtt.MqttEndpoint;
import io.vertx.mqtt.MqttServer;
import io.vertx.mqtt.MqttServerOptions;
import io.vertx.mqtt.MqttTopicSubscription;
import log4j2.LogAdapter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 18/04/2019
 * Time: 2:49 PM
 */
public class MainClass {
    private Vertx vertx = Vertx.vertx();
    private LogAdapter LOGGER = LogAdapter.newInstance(this.getClass());
    private static boolean isPeriodic = true;

    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.startMqtt().start();
    }

    private void start() {
        Router router = Router.router(vertx);

//        router.route("/eventbus/*").handler(eventBusHandler());
//        router.route().handler(staticHandler());

        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(8123);
    }

    private SockJSHandler eventBusHandler() {
        BridgeOptions options = new BridgeOptions()
                .addOutboundPermitted(new PermittedOptions().setAddressRegex(".*"))
                .addInboundPermitted(new PermittedOptions().setAddressRegex(".*"));
        EventBus eventBus = vertx.eventBus();

        SockJSHandler sockJSHandler = SockJSHandler.create(vertx);
        return sockJSHandler.bridge(options, event -> {
            String id = event.socket().writeHandlerID();
            LOGGER.trace("IDDDDDD: {}", id);
            LOGGER.warn("BBB--- {}", event.socket().remoteAddress());
            /*MultiMap map = event.socket().headers();
            map.forEach(item->{
               LOGGER.trace(item.getKey() +"   "+item.getValue());
            });*/
            Integer message = 0;
            if (event.type() == BridgeEventType.RECEIVE) {
                LOGGER.error("AAAAAAAAAA: {}", event.getRawMessage());
                //message = Integer.parseInt(event.getRawMessage().getString("body")) + 1;
            }
            if (event.type() == BridgeEventType.SOCKET_CREATED) {
                LOGGER.info("A socket was created");
            }

            if (event.type() == BridgeEventType.SEND) {
                LOGGER.trace("SEND MESSAGE TO");
                eventBus.publish("*", "thanh ho lao and " + message);
            }
            event.complete(true);
        });

    }

    private StaticHandler staticHandler() {
        return StaticHandler.create()
                .setCachingEnabled(false);
    }

    //
    private MainClass startMqtt() {
        MqttServer mqttServer = MqttServer.create(vertx, new MqttServerOptions().setPort(8234));
        Handler<MqttEndpoint> mqttEndPoint = getMqttEndPoint();
        mqttServer.endpointHandler(mqttEndPoint).listen(ar -> {
            if (ar.succeeded()) {
                LOGGER.trace("MQTT server is listening on port " + ar.result().actualPort());

            } else {

                LOGGER.trace("Error on starting the server");
                ar.cause().printStackTrace();
            }
        });
        return this;
    }

    private Handler<MqttEndpoint> getMqttEndPoint() {
        return endpoint -> {
            LOGGER.trace("MQTT client [" + endpoint.clientIdentifier() + "] request to connect, clean session = " + endpoint.isCleanSession());
            if (endpoint.auth() != null) {
                LOGGER.trace("[username = " + endpoint.auth().getUsername() + ", password = " + endpoint.auth().getPassword() + "]");
            }
//            if (endpoint.will() != null) {
//                LOGGER.trace("[will topic = " + endpoint.will().getWillTopic() + " msg = " + endpoint.will().getWillMessage() +
//                        " QoS = " + endpoint.will().getWillQos() + " isRetain = " + endpoint.will().isWillRetain() + "]");
//            }
            LOGGER.trace("keep alive timeout = " + endpoint.keepAliveTimeSeconds());
            // accept connection from the remote client
            endpoint.accept(true);
            endpoint.disconnectHandler(v -> {
                LOGGER.warn("Received disconnect from client: {}", endpoint.clientIdentifier());
            });

            //todo client publish message
            endpoint.publishHandler(message -> {
                LOGGER.debug("receive message from client: {} with QoS: {}", message.payload().toString(Charset.defaultCharset()), message.qosLevel());
                if (message.qosLevel() == MqttQoS.AT_LEAST_ONCE) {
                    endpoint.publishAcknowledge(message.messageId());
                } else if (message.qosLevel() == MqttQoS.EXACTLY_ONCE) {
                    endpoint.publishReceived(message.messageId());
                }

            }).publishReleaseHandler(endpoint::publishComplete);
            //todo handle subscribe from client
            endpoint.subscribeHandler(subscribe -> {
                List<MqttQoS> grantedQosLevels = new ArrayList<>();
                for (MqttTopicSubscription s : subscribe.topicSubscriptions()) {
                    LOGGER.trace("Subscription for " + s.topicName() + " with QoS " + s.qualityOfService());
                    grantedQosLevels.add(s.qualityOfService());
                }
                // ack the subscriptions request
                endpoint.subscribeAcknowledge(subscribe.messageId(), grantedQosLevels);
                LOGGER.info("DONE SUBSCRIBE");
            });
            if (isPeriodic) {
                isPeriodic = false;
                vertx.setPeriodic(4000, handle -> {
                    endpoint.publish("fdsgdfgdfghmfgdfj", Buffer.buffer("AN HO LAO"), MqttQoS.AT_MOST_ONCE, false, false, rs -> {
                        LOGGER.debug("Send message success or not: {} with message: {} to: {}", rs.succeeded(), rs.result(), endpoint.clientIdentifier());
                    });
                });
            }
        };
    }
}
