package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {
    final static Logger logger = LogManager.getLogger(MainClass.class);


    public static void main(String[] args) {
        testLog();
    }
    public static void testLog(){
        logger.fatal("this is fatal message");
        logger.error("this is error message");
        logger.warn("this is warn message");
        logger.info("this is info message");
        logger.debug("this is debug message");
        logger.trace("this is trace message");
    }
}
