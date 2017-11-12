package designPattern.structural.adapter;

public class Fly implements IMove {
    @Override
    public void moveByFoot() {

    }

    @Override
    public void moveBySwing() {
        System.out.println("I 'm flying...............");
    }

    @Override
    public void moveByTail() {

    }
}
