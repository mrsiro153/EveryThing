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
import java.sql.*;

public class MainClass {
    private static final LogAdapter log = LogAdapter.newInstance(MainClass.class);
    //
    public static void main(String[] args) {
        Gson gson = new Gson();
        LogAdapter l = LogAdapter.newInstance(MainClass.class);
        //
        String userName = "root";
        String url = "jdbc:mysql://192.168.18.49:6600/mydata";
        String password = "intelin";
        //
        Vertx vertx = Vertx.vertx();

        //vertx.setPeriodic(3000, id -> {
            Timestamp a = new Timestamp(System.currentTimeMillis());
            System.out.println("INSERTTTTTTTTTT: "  + a);

            try (Connection connection = DriverManager.getConnection(url, userName, password)) {
                connection.setAutoCommit(false);
                System.out.println("AUTO COMMIT: "+connection.getAutoCommit());
                DSLContext context = DSL.using(connection, SQLDialect.MYSQL);
                Table1Record r = context.insertInto(Tables.TABLE1)
                        .set(Tables.TABLE1.NAME,"abc")
                        .set(Tables.TABLE1.CREATEDAT,a)
                        .returning()
                        .fetchOne();
                /*System.out.println("AAAAAAAAAAAAAAA "+context.insertInto(Tables.TABLE1)
                        .set(Tables.TABLE1.NAME,"abc")
                        .set(Tables.TABLE1.CREATEDAT,a)
                        .returning()
                        .toString());*/
                System.out.println("save data: "+ r.getCreatedat() +"  "+r.getId()+"   "+r.getName());
                System.out.println("-----------------------------------------------------------------");
            } catch (SQLException e) {
                log.warn(e);
                //e.printStackTrace();
            }
        //});
    }

}
