package vertxRest;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.bridge.BridgeEventType;
import io.vertx.ext.bridge.PermittedOptions;
import io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.sockjs.BridgeOptions;
import io.vertx.ext.web.handler.sockjs.SockJSHandler;
import log4j2.Generator;
import log4j2.LogAdapter;
import log4j2.LogType;

import java.util.Date;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 18/01/2019
 * Time: 9:51 AM
 */
public class MainClass {
    private final LogAdapter LOGGER = LogAdapter.newInstance(this.getClass());
    private final Vertx vertx = Vertx.vertx(new VertxOptions()
            .setWorkerPoolSize(40)
            .setMaxWorkerExecuteTime(100));
    private HttpServer server;
    private Router router;

    public static void main(String[] args) {
        new MainClass()
                .start()
                //.initApi()
                .traditionalEventBus()
                .sockJsEventBus()
                .end();
    }

    public MainClass start() {
        router = Router.router(vertx);

        return this;
    }

    private MainClass initApi() {
        router.get("/haha")
                .handler(event -> {
                    String resp = handleRequest(event);
                    event.response()
                            .end(new JsonObject().put("hello", "world").toString());
                })
                .failureHandler(event -> {
                    event.response().end(new JsonObject().put("error", event.failure().getMessage()).toString());
                });
        return this;
    }

    private void end() {
        server = vertx.createHttpServer(new HttpServerOptions().setHost("localhost").setPort(8123));
        server.requestHandler(router::accept);
        server.listen(event -> {
            if (event.succeeded()) {
                System.out.println("OK");
                Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                    System.out.println("good bye!");
                    //vertx.close(closeResult -> System.out.println("Bye bye"));
                }));
            } else {
                System.out.println("error");
            }
        });
    }

    private String handleRequest(RoutingContext event) {
        vertx.executeBlocking(handle -> {
            LOGGER.setIdRequest(Generator.generateIdLog(LogType.END_USER));
            LOGGER.error("AAAAAAAAAAAAAAAAA " + new Date());
        }, res -> {
            //nothing
        });
        return "fsd";
    }

    private MainClass tcpEventbus() {
        TcpEventBusBridge bridge = TcpEventBusBridge.create(
                vertx,
                new io.vertx.ext.bridge.BridgeOptions()
                        .addInboundPermitted(new PermittedOptions().setAddress("in"))
                        .addOutboundPermitted(new PermittedOptions().setAddress("out")));

        bridge.listen(7000, res -> {
            if (res.succeeded()) {
                LOGGER.info("event bus start success");
            } else {
                LOGGER.error("event bus start failed cause by: {}", res.cause().getMessage());
            }
        });
        return this;

    }

    //
    private MainClass sockJsEventBus() {
        router.route("/eventbus_mqtt/*").handler(createNewSockJsHandler());
        return this;
    }

    private MainClass traditionalEventBus() {
        EventBus eb = vertx.eventBus();
        MessageConsumer<String> consumer = eb.consumer("doannh");
        consumer.handler(message -> {
            LOGGER.info("message: {}", message.body());
        });
        consumer.completionHandler(res -> {
            if (res.succeeded()) {
                System.out.println("The handler registration has reached all nodes");
            } else {
                System.out.println("Registration failed!");
            }
        });

        return this;
    }

    //
    private SockJSHandler createNewSockJsHandler() {
        PermittedOptions inboundPermitted = new PermittedOptions();
        //.setAddress("doannh");

        BridgeOptions options = new BridgeOptions().addInboundPermitted(inboundPermitted);
        SockJSHandler sockJSHandler = SockJSHandler.create(vertx);
        sockJSHandler.bridge(options, be -> {
            LOGGER.info("ABC DEF");
            System.out.println("------------------------------------------------------------");
            if (be.type() == BridgeEventType.PUBLISH || be.type() == BridgeEventType.SEND) {
                // Add some headers
                JsonObject headers = new JsonObject().put("header1", "val").put("header2", "val2");
                JsonObject rawMessage = be.getRawMessage();
                rawMessage.put("headers", headers);
                be.setRawMessage(rawMessage);
            }
            be.complete(true);
        });
        return sockJSHandler;
    }
}
