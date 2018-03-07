package codeWithoutIf.demo2;

public class MainClass {
    public static void main(String[] args) {
        Integer code = 2;
        HarryPotter h = new HarryPotter();
        Vampire v = new Vampire();
        BookEnum.getByCode(code).doSomething(v);
    }
}
