package vertxHealth;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.healthchecks.HealthCheckHandler;
import io.vertx.ext.healthchecks.HealthChecks;
import io.vertx.ext.healthchecks.Status;
import io.vertx.ext.web.Router;

public class MainClass {
    //
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        HealthCheckHandler healthCheckHandler = HealthCheckHandler.create(vertx);
        healthCheckHandler.register("add", future -> {
            //future.complete(Status.KO(new JsonObject().put("memory","2mb")));
            future.complete();
        });
        HealthCheckHandler healthCheckHandler1 = HealthCheckHandler.createWithHealthChecks(HealthChecks.create(vertx));
        healthCheckHandler1.register("add", future -> {
            future.complete();
        });
        //
        HttpServer server = vertx.createHttpServer(new HttpServerOptions().setHost("localhost").setPort(8080));
        Router router = Router.router(vertx);
        server.requestHandler(router::accept);
        router.get("/test").handler(healthCheckHandler);
        router.get("/abcd").handler(healthCheckHandler1);
        server.listen(event -> {
            if (event.succeeded()) {
                System.out.println("OK");
            } else {
                System.out.println("failed");
            }
        });
    }
}
