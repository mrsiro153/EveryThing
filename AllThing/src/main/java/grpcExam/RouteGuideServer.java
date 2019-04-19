package grpcExam;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class RouteGuideServer {
    private static final Logger logger = Logger.getLogger(RouteGuideServer.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 9500;
        server = ServerBuilder.forPort(port)
                .addService(new GreeterImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                RouteGuideServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        final RouteGuideServer server = new RouteGuideServer();
        server.start();
        server.blockUntilShutdown();
    }
    static class GreeterImpl extends io.grpc.examples.helloworld.GreeterGrpc.GreeterImplBase {

        @Override
        public void sayHello(io.grpc.examples.helloworld.HelloRequest req, StreamObserver<HelloReply> responseObserver) {
            System.out.println("say hello: "+req.getName() + " and age: "+req.getAge());
            HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()+" with age: "+req.getAge()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }

}
