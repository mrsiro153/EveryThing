package rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    private Channel channel;

    public static void main(String[] args) {
        MainClass m = new MainClass();
        //m.initMQ();
        String a= "fd";
        m.testLambda(a,vss->{
            System.out.println(vss);
            return a+"ds";
        });
        System.out.println("fdfdfd: "+a);
    }
    //
    public void initMQ(){
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("server02.ntex.vn");
            factory.setPort(5672);
            factory.setUsername("doannh");
            factory.setPassword("moonrider");
            factory.setVirtualHost("doanNH");
            factory.setConnectionTimeout(5000);
            factory.setAutomaticRecoveryEnabled(true);
            Connection connection = factory.newConnection();
            channel = connection.createChannel();
            //
            channel.queueDeclare("socket_web_queue",false,false,false,null);
            Consumer consumer = new DefaultConsumer(channel){
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    try {
                        String message = new String(body, "UTF-8");
                        System.out.println("Thread: " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());
                        System.out.println("Receive: " + message);
                        Thread tr = new Thread(() -> {
                            System.out.println("multi thread: " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());
                            //throw new RuntimeException("MULTI thread exception");
                        });
                        tr.start();
                        throw new RuntimeException("MQ exception");
                    }catch (Exception e){
                        System.out.println("Error in handle queue: "+e.toString());
                    }
                }
            };
            channel.basicConsume("socket_web_queue", true, consumer);
            //
            System.out.println("LISTEN success: "+Thread.currentThread().getId());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void testLambda(String s,FInterface fInterface){
        String result = fInterface.resultHandler(s);
        System.out.println(result);
    }
}
