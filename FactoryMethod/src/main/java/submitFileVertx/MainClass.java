package submitFileVertx;


import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.AsyncFile;
import io.vertx.core.file.FileProps;
import io.vertx.core.file.FileSystem;
import io.vertx.core.file.OpenOptions;
import io.vertx.core.http.*;
import io.vertx.core.json.JsonObject;
import io.vertx.core.streams.Pump;
import io.vertx.core.streams.ReadStream;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainClass {
    public static void main(String[] args) {
        new MainClass().test6();
    }

    //
    public void test1() {
        Vertx vertx = Vertx.vertx();
        HttpClientRequest req = vertx.createHttpClient(new HttpClientOptions()).post(9100, "localhost", "/image", resp -> {
            System.out.println("Response " + resp.statusCode());
        });

        String filename = "/home/ndoan/Downloads/gautruc.jpg";

        FileSystem fs = vertx.fileSystem();
        //String filename = file1.getAbsolutePath();
        fs.props(filename, ares -> {
            FileProps props = ares.result();
            System.out.println("props is " + props);
            long size = props.size();
            System.out.println("size: " + size);
            req.headers().set("token", "gdfgdfgdf").set("checking", "doanNH").set("device-id", "fdgdfgdfgdf");//.set("content-length", "" + size);
            req.setChunked(true);
            fs.open(filename, new OpenOptions().setCreate(true), ares2 -> {
                AsyncFile file = ares2.result();
                Pump pump = Pump.pump(file, req);
                file.endHandler(v -> {
                    req.end();
                });
                pump.start();
            });
        });
    }

    //
    public void test2() {
        Vertx vertx = Vertx.vertx();
        WebClient client = WebClient.create(vertx, new WebClientOptions());
        FileSystem fs = vertx.fileSystem();
        fs.open("/home/ndoan/Downloads/chonau.jpg", new OpenOptions(), fileRes -> {
            if (fileRes.succeeded()) {
                ReadStream<Buffer> fileStream = fileRes.result();
                String fileLen = "15480";

                // Send the file to the server using POST
                client
                        .post(9100, "localhost", "/image")
                        .putHeader("device-id", "g").putHeader("token", "gfdgdfg").putHeader("checking", "doannh")//.putHeader("content-length", fileLen)
                        .sendStream(fileStream, ar -> {
                            if (ar.succeeded()) {
                                // Ok
                                System.out.println("Success: " + ar.result().statusMessage());
                            } else {
                                System.out.println("failed!!!");
                            }
                        });
            }
        });
    }

    //
    public void test3() {
        Vertx vertx = Vertx.vertx();
        WebClient client = WebClient.create(vertx);
        client
                .post(9100, "localhost", "/image")
                .sendJsonObject(new JsonObject()
                        .put("firstName", "Dale")
                        .put("lastName", "Cooper"), ar -> {
                    if (ar.succeeded()) {
                        // Ok
                        System.out.println("success");
                    } else {
                        System.out.println("failed");
                    }
                });
    }

    //
    public void test4() {
        Vertx vertx = Vertx.vertx();
        HttpClientRequest req = vertx.createHttpClient(new HttpClientOptions()).post(9100, "localhost", "/image", resp -> {
            System.out.println("Response " + resp.statusCode());
        });
        String filename = "/home/ndoan/Downloads/hh.txt";
        FileSystem fs = vertx.fileSystem();
        fs.props(filename, ares -> {
            FileProps props = ares.result();
            System.out.println("props is " + props);
            long size = props.size();
            System.out.println("size: " + size);
            req.headers().set("content-length", String.valueOf(size)).set("token", "gdfgdfgdf").set("checking", "doanNH").set("device-id", "fdgdfgdfgdf");
            fs.open(filename, new OpenOptions(), ares2 -> {
                AsyncFile file = ares2.result();
                System.out.println("gffd");
                Pump pump = Pump.pump(file, req);
                file.endHandler(v -> {
                    req.end();
                });
                pump.start();
            });
        });
    }

    //
    public void test5() {
        Vertx vertx = Vertx.vertx();
        String filename = "/home/ndoan/Downloads/chonau.jpg";
        FileSystem fs = vertx.fileSystem();

        WebClient client = WebClient.create(vertx);

        fs.props(filename, ares -> {
            FileProps props = ares.result();
            System.out.println("props is " + props);
            long size = props.size();

            HttpRequest<Buffer> req = client.post(9100, "localhost", "/image");
            req.putHeader("content-length", "" + size)
                    .putHeader("device-id", "ggfd")
                    .putHeader("token", "gdfgdf")
                    .putHeader("checking", "gfddfgdfg");

            fs.open(filename, new OpenOptions(), ares2 -> {
                req.sendStream(ares2.result(), ar -> {
                    if (ar.succeeded()) {
                        HttpResponse<Buffer> response = ar.result();
                        System.out.println("Got HTTP response with status " + response.statusCode());
                    } else {
                        ar.cause().printStackTrace();
                    }
                });
            });
        });
    }

    //
    public void createServerVertx() {
        Vertx vertx = Vertx.vertx();
        vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
            public void handle(HttpServerRequest req) {
                if (req.path().equals("/")) {
                    req.response().sendFile("localhost:9100/image");
                } else {
                    req.response().sendFile("localhost:9100/image");
                }
            }
        }).listen(8080);
    }

    //
    public void test6() {
        Vertx vertx = Vertx.vertx();
        HttpClient client = vertx.createHttpClient(new HttpClientOptions().setDefaultPort(9100).setDefaultHost("localhost"));

        final HttpClientRequest req = client.post("/image", response -> {
                    System.out.println("File uploaded " + response.statusCode());
                }
        );
        String filename = "/home/ndoan/Downloads/hh.txt";

        // For a non-chunked upload you need to specify size of upload up-front
        try {
            req.headers()
                    .set("device-id", "ggfd")
                    .set("token", "gdfgdf")
                    .set("checking", "gfddfgdfg")
                    .set("Content-Length", String.valueOf(Files.size(Paths.get(filename))));
            System.out.println(String.valueOf(Files.size(Paths.get(filename))));
            // For a chunked upload you don't need to specify size, just do:
             req.setChunked(true);

            vertx.fileSystem().open(filename, new OpenOptions(), ar -> {
                final AsyncFile file = ar.result();
                ReadStream<Buffer> fileStream = file.handler(event -> {});
                Pump pump = Pump.pump(fileStream, req);
                pump.start();

                file.endHandler(event -> file.close(ar1 -> {
                    if (ar1.succeeded()) {
                        req.end();
                        System.out.println("Sent request");
                    } else {
                        ar1.cause().printStackTrace(System.err);
                    }
                }));
            });
        } catch (Exception e) {

        }
    }
}
