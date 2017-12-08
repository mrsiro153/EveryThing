package jooqDemo.test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jooqDemo.model.Account;
import jooqDemo.model.Tables;
import jooqDemo.model.tables.records.DdaccountRecord;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UpdateSetMoreStep;
import org.jooq.impl.DSL;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
    //
    public static void main(String[] args) {
        String userName = "root";
        String url = "jdbc:mysql://server03.ntex.vn:9900/account";
        String password = "1@3Pikachu";
        //
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            DSLContext context = DSL.using(connection, SQLDialect.MYSQL);
            DdaccountRecord accountRecord = context.selectFrom(Tables.DDACCOUNT)
                    .fetchInto(DdaccountRecord.class).get(85);
            System.out.println(accountRecord);
            System.out.println();
            System.out.println();
            Gson gson = new Gson();
            String s = gson.toJson(accountRecord.intoMap());
            System.out.println(s);
            //
            //
            System.out.println();

            Map<String, Object> map = new HashMap<String, Object>();
            map = gson.fromJson(s,new TypeToken<HashMap<String,Object>>(){
            }.getType());


            for(String key: map.keySet()){
                System.out.println("key: "+key);
                System.out.println("value: "+map.get(key).toString());
                System.out.println(map.get(key).getClass());
            }
            System.out.println();

            DdaccountRecord ddaccountRecord = new DdaccountRecord();
            ddaccountRecord.fromMap(map);
            System.out.println(ddaccountRecord);

            //
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dsds(){
        /*UpdateSetMoreStep query = context.update(ddaccountRecord.getTable())
                .set(ddaccountRecord);
        for(TableField<DdaccountRecord, ?> keyField : ddaccountRecord.getTable().getPrimaryKey().getFields()){
            query.where(ddaccountRecord.getTable().getPrimaryKey().getFields().equals(ddaccountRecord.getId()));
        }
        Integer x = query.execute();
        System.out.println(x);*/
    }
}
