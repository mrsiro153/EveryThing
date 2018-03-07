package codeWithoutIf.demo1;

public class MainClass {
    public static void main(String[] args) {
        Integer code =1;
        MyEnum m = MyEnum.getByCode(code);
        m.doSomething(new Service1());
        //
        System.out.println("---------------------------------------------------------");
    }
}
