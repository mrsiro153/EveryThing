package submitFileVertx.pk1;

import io.vertx.core.Vertx;

public class Server {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.createHttpServer().requestHandler(req -> {

            req.bodyHandler(buff -> {
                System.out.println("Receiving user " + buff.toString() + " from client ");
                req.response().end();
            });

        }).listen(8080, listenResult -> {
            if (listenResult.failed()) {
                System.out.println("Could not start HTTP server");
                listenResult.cause().printStackTrace();
            } else {
                System.out.println("Server started");
            }
        });
    }
}
