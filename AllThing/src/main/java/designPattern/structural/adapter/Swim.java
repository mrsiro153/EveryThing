package designPattern.structural.adapter;

public class Swim implements IMove{
    @Override
    public void moveByFoot() {

    }

    @Override
    public void moveBySwing() {

    }

    @Override
    public void moveByTail() {
        System.out.println("I 'm swimming...........");
    }
}
