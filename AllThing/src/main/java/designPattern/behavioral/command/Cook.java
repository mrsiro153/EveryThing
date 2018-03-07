package designPattern.behavioral.command;

public class Cook extends ICommand {
    private String privilege = "cook";

    @Override
    public String execute(OrderDish dish) {
        return "your dish is done, enjoy this";
    }
}
