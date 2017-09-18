package multiThread;

public class FactoryImpl implements IFactory,Runnable {
    private String name;
    private static FactoryImpl instance;
    public String getName() {
        return name;
    }

    private FactoryImpl(String name) {
        this.name = name;
    }
    public FactoryImpl(){

    }

    public static FactoryImpl getInstance(){
        if(instance==null){
            instance= new FactoryImpl("SingleFactory");
        }
        return instance;
    }

    @Override
    public void run() {
        System.out.println("Thread: "+Thread.currentThread().getName()+ " id:"+Thread.currentThread().getId());
        System.out.println(this);
    }

    @Override
    public IProduct crateProduct() {
        return new ProductImpl();
    }
}
