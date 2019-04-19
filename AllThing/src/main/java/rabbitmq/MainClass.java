package rabbitmq;

import com.rabbitmq.client.*;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import log4j2.Generator;
import log4j2.LogAdapter;
import log4j2.LogType;

import java.io.IOException;

public class MainClass {
    private final LogAdapter logger = LogAdapter.newInstance(this.getClass());
    private Channel channel;
    private static final String default_queue = "siro_queue";
    private Vertx vertx = Vertx.vertx(new VertxOptions()
            .setWorkerPoolSize(40)
            .setMaxWorkerExecuteTime(100));


    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.initMQ();
        //m.testlog();
    }

    //
    private void initMQ() {
        try {
            //
            String idLog = Generator.generateIdLog(LogType.END_USER);
            logger.setIdRequest(idLog);
            //logger.setIdRequest(idLog);
            logger.warn("test 1 fdsfds" + "   " + Thread.currentThread().getName());
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("192.168.18.55");
            factory.setPort(7000);
            factory.setUsername("intelin");
            factory.setPassword("AbCd@1234");
            factory.setVirtualHost("/");
            factory.setConnectionTimeout(5000);
            factory.setAutomaticRecoveryEnabled(true);
            Connection connection = factory.newConnection();
            channel = connection.createChannel();
            abc();
            //
            channel.queueDeclare(default_queue, false, false, false, null);
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    try {
                        String idLog = Generator.generateIdLog(LogType.CORE);
                        logger.setIdRequest(idLog);
                        abc();
                        logger.warn("idLOG: {}", Thread.currentThread().getName());
                        String message = new String(body, "UTF-8");
                        logger.debug("Receive: " + message);
                        vertx.executeBlocking(handle -> {
                            abc();
                            logger.setIdRequest(idLog);
                            logger.trace("fdsfdsfdsjhfdsjfds");
                            handle.complete();
                        }, rs -> {
                            logger.setIdRequest(idLog);
                            logger.trace("notthing to sayyyyyyyyyy");
                        });
                        Thread tr = new Thread(() -> {
                            abc();
                            logger.setIdRequest(idLog);
                            logger.error("multi thread: " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());
                            //throw new RuntimeException("MULTI thread exception");
                        });
                        tr.start();
                    } catch (Exception e) {
                        logger.trace("Error in handle queue: " + e.toString());
                    }
                }
            };
            channel.basicConsume(default_queue, true, consumer);
            //
            logger.info("LISTEN success: " + Thread.currentThread().getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testLambda(String s, FInterface fInterface) {
        String result = fInterface.resultHandler(s);
        logger.trace(result);
    }

    private void abc() {
//        System.out.println("------------------------------");
//        System.out.println("event loop: "+vertx.getOrCreateContext().isEventLoopContext());
//        System.out.println("worker: "+vertx.getOrCreateContext().isWorkerContext());
//        System.out.println("isMultiThreadedWorkerContext: "+vertx.getOrCreateContext().isMultiThreadedWorkerContext());
//        System.out.println("------------------------------");
    }

    private void testlog() {
        logger.setIdRequest(Generator.generateIdLog(LogType.AUTO));
        logger.error("fdsfdsjfgdskjfdsfds");
    }
}
