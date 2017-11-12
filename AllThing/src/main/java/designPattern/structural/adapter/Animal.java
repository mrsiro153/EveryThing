package designPattern.structural.adapter;

public class Animal {
    private String name;
    private String moveType;
    private Adapter adapter;

    public Animal(String name, String moveType) {
        this.name = name;
        this.moveType = moveType;
        adapter = new Adapter();
    }

    public void printInfo() {
        System.out.println("This animal is: " + name);
        adapter.breath();
        try {
            IMove m = adapter.getMovingWay(moveType);
            if (m == null) {
                System.out.println("Un_support with type: " + moveType);
                throw new RuntimeException("Un_support");
            }
            switch (m.getClass().getSimpleName()) {
                case "Run":
                    m.moveByFoot();
                    break;
                case "Fly":
                    m.moveBySwing();
                    break;
                case "Swim":
                    m.moveByTail();
                    break;
                default:
                    System.out.println("Un_support!!!");
                    System.out.println(m.getClass().getSimpleName());
            }
        } catch (RuntimeException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
