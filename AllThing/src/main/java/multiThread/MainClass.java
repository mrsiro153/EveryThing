package multiThread;

public class MainClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(FactoryImpl.getInstance());
        t1.start();
        //
        IFactory f = FactoryImpl.getInstance();
        f.crateProduct().getInfo();

    }
}
