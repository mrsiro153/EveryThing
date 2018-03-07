package designPattern.behavioral.command;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class ICommand {
    protected Logger logger = LogManager.getLogger(this.getClass());

    public abstract String execute(OrderDish dish);
}
