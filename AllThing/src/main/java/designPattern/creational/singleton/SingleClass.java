package designPattern.creational.singleton;

public class SingleClass {
    //only one instance
    // can not new this class
    private SingleClass(String name) {
        this.name=name;
    }
    private String name;
    //

    public String getName() {
        return name;
    }

    private static SingleClass instance;
    //
    public static SingleClass getInstance() {
        if (instance==null){
            instance = new SingleClass("I am single");
        }
        return instance;
    }
}
