package javaInnerOuter;

public class MainClass {
    public static void main(String[] args) {
        demoInnerInterface();
    }

    private static void demoInnerClass() {
        MyClass m = new MyClass();
        MyClass.MyInnerClass myInnerClass = m.new MyInnerClass();
        myInnerClass.show();
        //annonymus class
        MyClass m2 = new MyClass() {
            @Override
            public void funcMyClass() {
                System.out.println("hhahh");
                super.funcMyClass();
            }
        };
        m2.funcMyClass();
        //
        m.demoMyInnerClass1();
    }

    private static void demoInnerStaticClass() {
        MyClassStatic.MyInnerClassStatic m = new MyClassStatic.MyInnerClassStatic();
        m.talk();
        MyClassStatic.MyInnerClassStatic.talk1();
    }

    private static void demoInnerInterface() {
        MyInterface my = new MyInterface() {

        };
        MyInterface.InnerInterface m = new MyInterface.InnerInterface() {
            @Override
            public void show() {
                System.out.println("InnerInterface show something");
            }
        };
        MyInterface.InnerInterface1 m1 = () -> System.out.println("InnerInterface show something");
        m.show();
        m1.talk();
        //
        MyInterface.InnerClassInsideInterface c = new MyInterface.InnerClassInsideInterface();
        c.showByInnerClass();


    }
}
