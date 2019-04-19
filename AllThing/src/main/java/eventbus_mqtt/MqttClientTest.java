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
                .setClientId("gdfgd"));
        //MqttClient client = MqttClient.create(vertx);
        client.connect(8234, "localhost", s -> {
            LOGGER.info("Connect success!");
            client.publishHandler(s1 -> {
                LOGGER.info("There are new message in topic: " + s1.topicName());
                LOGGER.info("Content(as string) of the message: " + s1.payload().toString());
                LOGGER.info("QoS: " + s1.qosLevel());
                LOGGER.trace("--------------------------------------------------------");
            })
                    .subscribe("siro/client5", MqttQoS.EXACTLY_ONCE.value());
        });
//        client.publish("ABCDEFFFF", Buffer.buffer("Doannh"), MqttQoS.EXACTLY_ONCE,false,false,abc->{
//            LOGGER.trace("Send message success or not: {}",abc.succeeded());
//        });
        LOGGER.error("------------------------------------------------");
        return this;
    }
}
