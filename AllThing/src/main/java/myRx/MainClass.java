package myRx;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 10/10/2019
 * Time: 4:59 PM
 */
public class MainClass {
    public static void main(String[] args) {
        new MainClass().test();
    }

    private void test() {
        String s = MyRx.create(1)
                .execute(it -> {
                    return it;
                })
                .execute(it -> {
                    System.out.println(this);
                    fdsfds();
                    return it + 5;
                })
                .executeChange(vl -> {
                    System.out.println(vl);
                    return MyRx.create("hello");
                })
                .execute(it -> {
                    return it + "fdssdfsdfds";
                }).getValue();
        System.out.println(s);
    }

    private void fdsfds() {
        System.out.println(this);
        System.out.println("dfsfddsfds");
    }
}
