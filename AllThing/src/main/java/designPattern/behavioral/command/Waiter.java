package designPattern.behavioral.command;

public class Waiter extends ICommand {
    private String privilege = "waiter";

    @Override
    public String execute(OrderDish dish) {
        logger.info("you dish is going to cook...please wait");
        Cook c = new Cook();
        return c.execute(dish);
    }
}
