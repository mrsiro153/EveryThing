package jooqDemo.test;

import io.vertx.core.Vertx;
import jooqDemo.model.Tables;
import jooqDemo.model.tables.records.Table1Record;
import log4j2.LogAdapter;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 15/12/2018
 * Time: 2:32 PM
 */
public class MainClassGet {
    private final static LogAdapter l = LogAdapter.newInstance(MainClassGet.class);
    //
    private static final String userName = "root";
    private static final String url = "jdbc:mysql://192.168.18.49:8060/mydata";
    private static final String password = "intelin";
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.setPeriodic(2000, id -> {
            try (Connection connection = DriverManager.getConnection(url, userName, password)) {
                DSLContext context = DSL.using(connection, SQLDialect.MYSQL);
                Integer rc = context.selectCount().from(Tables.TABLE1)
                        .fetchInto(Integer.class).get(0);
                l.warn(rc);
            } catch (Exception e) {
                l.error(e.getMessage());
            }
            System.out.println("---------------------------------------------------------------------------------");
        });

    }
}
