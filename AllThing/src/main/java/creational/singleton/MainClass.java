package creational.singleton;

public class MainClass {

    public static void main(String[] args) {
        SingleClass sg = SingleClass.getInstance();
        SingleClass sg1 = SingleClass.getInstance();
        System.out.println("sg: "+sg);
        System.out.println("sg1: "+sg1);
    }
}
