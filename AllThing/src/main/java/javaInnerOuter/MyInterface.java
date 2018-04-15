package javaInnerOuter;

public interface MyInterface {
    interface InnerInterface{
        void show();
    }
    //
    interface InnerInterface1{
        void talk();
    }
    class InnerClassInsideInterface{
        public void showByInnerClass(){
            System.out.println("InnerClassInsideInterface show something");
        }
    }

}
