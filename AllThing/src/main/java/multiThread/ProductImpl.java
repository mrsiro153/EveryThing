package multiThread;

public class ProductImpl implements IProduct {

    @Override
    public void getInfo() {
        System.out.println("ThreadIProduct :"+Thread.currentThread().getName());
        System.out.println("Product Info ");
    }
}
