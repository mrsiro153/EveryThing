package designPattern.creational.objectPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;

public class MainClass {
    private final Logger logger = LogManager.getLogger(this.getClass());
    //

    public static void main(String[] args) {
        MyConnectionPool myConnectionPool = new MyConnectionPool("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/YourDBName",
                "sa", "secret");
        //get connection
        Connection c = myConnectionPool.checkOut();
        ///use connection
        //
        //
        myConnectionPool.checkIn(c);


    }
}
