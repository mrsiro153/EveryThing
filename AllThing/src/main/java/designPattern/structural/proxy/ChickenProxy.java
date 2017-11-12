package designPattern.structural.proxy;

public class ChickenProxy implements IChicken{

    private ChickenReal chickenReal;

    public ChickenProxy() {
        chickenReal = new ChickenReal();
    }

    @Override
    public void talk() {
        chickenReal.talk();
    }
}
