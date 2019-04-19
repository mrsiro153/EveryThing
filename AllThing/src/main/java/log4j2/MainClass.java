package log4j2;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.AppendersPlugin;

import java.util.Date;

public class MainClass {
    private final LogAdapter logger = LogAdapter.newInstance(this.getClass());


    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.testLog();
    }

    private void testLog() {
        String idRequest = Generator.generateIdLog(LogType.END_USER);
        logger.setIdRequest(idRequest);
        logger.warn(new Date() + "  ----- this is warn message: {}", "WARN ------");
        Thread t = new Thread(() -> {
            logger.setIdRequest(idRequest);
            logger.error("hello world");
        });
        t.start();
        //
        Vertx vertx = Vertx.vertx();
        vertx.executeBlocking(handle->{
            logger.setIdRequest(idRequest);
            logger.trace("HAHAHAH");
        },res->{
            logger.trace("NOTHING to say");
        });
    }
}
