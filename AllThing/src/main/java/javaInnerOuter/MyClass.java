package javaInnerOuter;

public class MyClass {
    public final String name = "ffd";

    public void funcMyClass(){
        System.out.println("MyClass say hello");
    }

    public void demoMyInnerClass1(){
        class MyInnerClassInsideFunction{
            String abc = "fdfd";

            private void saySomth(){
                System.out.println("MyInnerClassInsideFunction say something " +abc);
            }
        }
        MyInnerClassInsideFunction myInnerClassInsideFunction = new MyInnerClassInsideFunction();
        myInnerClassInsideFunction.saySomth();

    }

    //
    class MyInnerClass{

        //
        public void show(){
            System.out.println("MyInnerClass show! "+name);
        }
    }
    //
}
