package designPattern.structural.adapter;

public class Adapter implements IBreath {

    private IMove movingWay;

    @Override
    public void breath() {
        System.out.println("Breathing......");
    }

    public IMove getMovingWay(String moveType) {

        switch (moveType) {
            case "Run":
                movingWay = new Run();
                break;
            case "Fly":
                movingWay = new Fly();
                break;
            case "Swim":
                movingWay = new Swim();
                break;
        }
        return movingWay;
    }
}
