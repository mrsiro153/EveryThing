package designPattern.structural.facade;

public class FacadeClass {
    // facade pattern
    //if some object wants to interact to wheel or light
    //it has only one way is interacting facade class
    private Wheel wheel = new Wheel();
    private Light light = new Light();
    private String name;

    public FacadeClass(String name) {
        this.name = name;
    }
    public void getFacade(){
        //this is a car
        //hiding parts of car
        System.out.println("The card of: "+name +" has:");
        wheel.getWheel();
        light.getLight();

    }
}
