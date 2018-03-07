import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class TestClass {

    final Logger logger = LogManager.getLogger(TestClass.class);

    public static void main(String[] args) {
        System.out.println("fdfd");
        TestClass t = new TestClass();
        t.printSomething();
    }
    public void printSomething(){
        System.out.println("fdsfsdfsdfsd");
    }
}
