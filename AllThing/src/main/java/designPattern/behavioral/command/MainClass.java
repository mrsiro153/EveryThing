package designPattern.behavioral.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {
    static final Logger logger = LogManager.getLogger(MainClass.class);


    public static void main(String[] args) {
        MainClass m = new MainClass();
        OrderDish dish = new OrderDish("vegetable salad");
        m.request(dish,result->{
            logger.info("result of request: {}",result);
        });
    }
    void request(OrderDish dish,ICallBack callBack){
        Waiter w = new Waiter();
        callBack.callBack(w.execute(dish));
    }
}
