package designPattern.structural.proxy;

public class ChickenReal implements IChicken {

    @Override
    public void talk() {
        System.out.println("O O O, wake up now!!!");
    }

    private void run(){
        System.out.println("I run with 2 legs");
    }
}
