package designPattern.structural.adapter;

public class Run implements IMove {
    @Override
    public void moveByFoot() {
        System.out.println("I 'm running...............");
    }

    @Override
    public void moveBySwing() {

    }

    @Override
    public void moveByTail() {

    }
}
