package designPattern.behavioral.command;

public class OrderDish {
    private String nameOfDis;

    public OrderDish(String nameOfDis) {
        this.nameOfDis = nameOfDis;
    }

    public String getNameOfDis() {
        return nameOfDis;
    }

    public void setNameOfDis(String nameOfDis) {
        this.nameOfDis = nameOfDis;
    }
}
