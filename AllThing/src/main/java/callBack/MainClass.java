package callBack;

public class MainClass {
    public static void main(String[] args) {
        new MainClass().test();
    }

    //
    private void doCallBack(MyCallBack myCallBack, String input) {
        myCallBack.callBack(input);
    }

    private void test() {
        doCallBack(v -> {
            v += " doan NH";
            System.out.println(v);
        }, "hello");


    }
}
