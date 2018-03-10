package designPattern.creational.objectPool;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionPool extends ObjectPool<Connection> {

    private String dsn, usr, pwd;

    public MyConnectionPool(String driver, String dsn, String usr, String pwd) {
        //super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dsn= dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    public Connection create() {
        try {
            return DriverManager.getConnection(dsn,usr,pwd);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean validate(Connection o) {
        try{
            return (! o.isClosed());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void expried(Connection o) {
        try {
            o.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
