package designPattern.creational.prototype;

public class MainClass {
    public static void main(String[] args) {
        try {
            VerhicalFactory vf = new VerhicalFactory();
            IVerhical ver = vf.getPrototypes("Audi");
            System.out.println(ver.getClass());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
