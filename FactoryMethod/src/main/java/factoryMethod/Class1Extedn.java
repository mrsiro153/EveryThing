package factoryMethod;

/**
 * Created by huydoan on 13/08/2017.
 */
public class Class1Extedn extends Class1 {
    public Class1Extedn(String x) {
        super(x);
    }
    @Override
    public void talk() {
        super.talk();
        System.out.println("hehehehehehe");
    }
    //

    @Override
    public String getX() {
        return "hi' hi'";
    }
}
