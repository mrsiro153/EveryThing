package methodReference;

import sun.applet.Main;

public class MainClass {
    public static final String data = "ahhahaaa";
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        IMyInterface m = s -> {
            String axv = "fdfdfd";
            s+=axv;
            System.out.println(s);
        };
        IMyInterface m1 = mainClass::methodReference;
        // 2 way to define new Functional interface: by lambda expression and method reference
        m.myMethod(data);
        m1.myMethod(data);
    }
    public void methodReference(String s){
        String axv = "fdfdfd";
        s+=axv;
        System.out.println(s);
    }
}
