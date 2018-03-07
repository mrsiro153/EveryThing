package designPattern.behavioral.iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {
    private final Logger logger = LogManager.getLogger(this.getClass());

    public static void main(String[] args) {
        new MainClass().test();

    }
    //
    private void test(){
        BookCollection bookCollection = new BookCollection();
        Iterator x = bookCollection.createIterator();
        BookAggregate b = x.first();
        logger.info("1st book is: {} and name is: {}",b.getId(),b.getNameOfBook());
        b = x.next();
        x.next();
        x.next();
        x.next();
        x.next();
        b= x.next();
        logger.info("next book is: {} and name is: {}",b.getId(),b.getNameOfBook());

    }
}
