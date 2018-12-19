package jooqDemo.test;

import com.google.gson.Gson;
import io.vertx.core.Vertx;
import jooqDemo.model.Tables;
import jooqDemo.model.tables.Table1;
import jooqDemo.model.tables.records.Table1Record;
import log4j2.LogAdapter;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.io.EOFException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;

public class MainClass {
    //
    public static void main(String[] args) {
        Gson gson = new Gson();
        LogAdapter l = LogAdapter.newInstance(MainClass.class);
        //
        String userName = "root";
        String url = "jdbc:mysql://192.168.18.49:8060/mydata";
        String password = "intelin";
        //
        Vertx vertx = Vertx.vertx();

        vertx.setPeriodic(5000, id -> {
            System.out.println("Now: "  + new Timestamp(System.currentTimeMillis()));

            try (Connection connection = DriverManager.getConnection(url, userName, password)) {
                DSLContext context = DSL.using(connection, SQLDialect.MYSQL);
                Timestamp a = new Timestamp(System.currentTimeMillis());
                System.out.println(a.toString());
                TableRecord<?> r = context.insertInto(Tables.TABLE1)
                        .set(Tables.TABLE1.CREATEAT, a)
                        .returning(Tables.TABLE1.CREATEAT)
                        .fetchOne();
                System.out.println(((Table1Record) r).getCreateat());
            } catch (SQLException e) {
                System.out.println("SQL Exception: " + e.getMessage());
                e.printStackTrace();
            }
        });
    }

}
