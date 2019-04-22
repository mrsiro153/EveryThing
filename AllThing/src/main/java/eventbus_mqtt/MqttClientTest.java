package eventbus_mqtt;

import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.mqtt.MqttClient;
import io.vertx.mqtt.MqttClientOptions;
import log4j2.LogAdapter;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 19/04/2019
 * Time: 1:45 PM
 */
public class MqttClientTest {
    private final LogAdapter LOGGER = LogAdapter.newInstance(this.getClass());

    public static void main(String[] args) {
        try {
            new MqttClientTest().connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private MqttClientTest connect() {
        Vertx vertx = Vertx.vertx();
        MqttClient client = MqttClient.create(vertx, new MqttClientOptions()
                .setCleanSession(false)
                .setClientId("doannh-clid1")
                .setUsername("username1")
                .setPassword("qwerty")
                .setWillTopic("doannh_topic1")
                .setWillQoS(MqttQoS.EXACTLY_ONCE.value()));
        //MqttClient client = MqttClient.create(vertx);
        client.connect(8234, "localhost", s -> {
            LOGGER.info("Connect success!");
            client.publishHandler(s1 -> {
                LOGGER.info("There are new message in topic: " + s1.topicName());
                LOGGER.info("Content(as string) of the message: " + s1.payload().toString());
                LOGGER.info("QoS: " + s1.qosLevel());
                LOGGER.trace("--------------------------------------------------------");
            }).subscribeCompletionHandler(mqttSubAckMessage -> {
                LOGGER.trace("Id of just received SUBACK packet is " + mqttSubAckMessage.messageId());
                for (int i : mqttSubAckMessage.grantedQoSLevels()) {
                    if (i == 0x80) {
                        LOGGER.trace("Failure");
                    } else {
                        LOGGER.trace("Success. Maximum QoS is " + i);
                    }
                }
            })
                    .subscribe("doannh1", MqttQoS.EXACTLY_ONCE.value());
            //
//            vertx.setPeriodic(2000,handle->{
//                client.publish("doannh1",Buffer.buffer("hello message from doannh client"),MqttQoS.EXACTLY_ONCE,false,false,rs->{
//                    LOGGER.warn("Send message success or not: {}",rs.succeeded());
//                });
//            });
        });
        LOGGER.error("------------------------------------------------");
        return this;
    }
}
