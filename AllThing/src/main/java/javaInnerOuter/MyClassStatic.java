package javaInnerOuter;

public class MyClassStatic {
    //
    static String name ="hehe";
    //
    public static class MyInnerClassStatic{
        void talk(){
            System.out.println("MyInnerClassStatic talk something | "+name);
        }
        static void talk1(){
            System.out.println("MyInnerClassStatic talk something | "+name);
        }
    }
}
