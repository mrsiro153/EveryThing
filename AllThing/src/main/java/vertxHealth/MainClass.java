package vertxHealth;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.healthchecks.HealthCheckHandler;
import io.vertx.ext.healthchecks.HealthChecks;
import io.vertx.ext.healthchecks.Status;
import io.vertx.ext.web.Router;

import java.io.InputStream;

public class MainClass {
    //
    static Vertx vertx;

    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.mainFunction();
    }

    public void processAPI() {
        Runtime r = Runtime.getRuntime();
        System.out.println("total memory: " + r.totalMemory());
        System.out.println("free memory: " + r.freeMemory());
        r.gc();
        System.out.println("::Memory status::");
        System.out.println("Total memory: " + r.totalMemory());
        System.out.println("Free memory: " + r.freeMemory());
        System.out.println("----------------------------------");
    }

    public void mainFunction() {
        vertx = Vertx.vertx();
        HealthCheckHandler healthCheckHandler = HealthCheckHandler.create(vertx);
        healthCheckHandler.register("add", future -> {
            //future.complete(Status.KO(new JsonObject().put("memory","2mb")));
            processAPI();
            future.fail("donot know");
        });
        //
        //
        HttpServer server = vertx.createHttpServer(new HttpServerOptions().setHost("localhost").setPort(8080));
        Router router = Router.router(vertx);
        server.requestHandler(router::accept);
        router.get("/test").handler(healthCheckHandler);
        server.listen(event -> {
            if (event.succeeded()) {
                System.out.println("OK");
            } else {
                System.out.println("failed");
            }
        });
    }

    public void currentPercentOfCPU() throws Exception {
        String[] command =  new String[](
                "/bin/sh",
                "-c",
                "grep 'cpu ' /proc/stat | awk '{usage=($2+$4)*100/($2+$4+$5)} END {print usage \"%\"}'"
                //"echo $PPID"
        );
    }

    public void currentPercentRam() {
        Process proc = Runtime.getRuntime().exec(new String[]{
                "/bin/sh",
                "-c",
                "free -m | grep Mem | awk '{usage=($7*100/$2)} END {print usage \"%\"}'"
        });
        String s = printToConsole(proc);
        System.out.println("Your %FreeRam is: " + s);
    }

    public String runCMDCommand(String[] commands) throws Exception {
        Process proc = Runtime.getRuntime().exec(commands);

        if (proc.waitFor() == 0) {
            InputStream in = proc.getInputStream();
            int available = in.available();
            byte[] outputBytes = new byte[available];
            in.read(outputBytes);
            String result = new String(outputBytes);
            System.out.println("Result is: " + result);
            return result;
        }
        return "";
    }
}
