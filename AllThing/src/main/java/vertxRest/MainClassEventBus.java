package vertxRest;

import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import log4j2.LogAdapter;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 18/04/2019
 * Time: 1:50 PM
 */
public class MainClassEventBus {
    private LogAdapter LOGGER = LogAdapter.newInstance(this.getClass());
    public static void main(String[] args) {
        MainClassEventBus m = new MainClassEventBus();
        m.abc();
    }
    private void abc(){
        Vertx vertx = Vertx.vertx();
        EventBus eb = vertx.eventBus();
        eb.send("localhost:7000","",rs->{
            LOGGER.error("SUCCESS OR NOT: {}",rs.succeeded());
            LOGGER.warn(rs.cause().getMessage());
        });
        eb.send("localhost:8123", "eventbus_mqtt", rs->{
           LOGGER.error("success or not: {}",rs.succeeded());
           LOGGER.warn(rs.cause().getMessage());
        });
        eb.publish("doannh","hello world");
        LOGGER.trace("END --------------------------------------------------------------------------");
    }
}
