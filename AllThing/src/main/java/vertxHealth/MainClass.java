package vertxHealth;

import io.vertx.core.Context;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.impl.VertxImpl;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.healthchecks.HealthCheckHandler;
import io.vertx.ext.healthchecks.HealthChecks;
import io.vertx.ext.healthchecks.Status;
import io.vertx.ext.web.Router;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class MainClass {
    //
    static Vertx vertx;

    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.mainFunction();
    }

    public JsonObject processAPI() {
        try {
            String percentCPUUsage = currentPercentOfCPU().trim();
            String percentRAMUsage = currentPercentRam().trim();
            Integer activeThread = getNumberActiveVertxThread();
            JsonObject jsonObject = new JsonObject().put("CPUPercent",percentCPUUsage)
                    .put("RAMPercent",percentRAMUsage)
                    .put("activeThread",activeThread);
            return jsonObject;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new JsonObject();
    }

    public void mainFunction() {
        vertx = Vertx.vertx(new VertxOptions().setWorkerPoolSize(40).setMaxWorkerExecuteTime(500));
        HealthCheckHandler healthCheckHandler = HealthCheckHandler.create(vertx);
        healthCheckHandler.register("healthCheck", future -> {
            //future.complete(Status.KO(new JsonObject().put("memory","2mb")));
            JsonObject jsonObject = processAPI();
            /*future.fail("donot know");*/
            future.complete(Status.OK(jsonObject));
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

    public String currentPercentOfCPU() throws Exception {
        String[] command =  new String[]{
                "/bin/sh",
                "-c",
                "grep 'cpu ' /proc/stat | awk '{usage=($2+$4)*100/($2+$4+$5)} END {print usage \"%\"}'"
                //"echo $PPID"
        };
        String s = runCMDCommand(command);
        System.out.println("Your %CPU usage is: "+s);
        return s;
    }

    public String currentPercentRam() throws Exception{
        String[] command  = new String[]{
                "/bin/sh",
                "-c",
                "free -m | grep Mem | awk '{usage=100-($7*100/$2)} END {print usage \"%\"}'"
        };
        String s = runCMDCommand(command);
        System.out.println("Your %RamUsage is: " + s);
        return s;
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
    public Integer getNumberActiveVertxThread(){
        VertxImpl vertxImpl = (VertxImpl) vertx;
        ExecutorService executorService  =  vertxImpl.getWorkerPool();
        Integer x = ((ThreadPoolExecutor) executorService).getActiveCount();
        System.out.println("Active thread: "+x);
        return x;
    }
}
