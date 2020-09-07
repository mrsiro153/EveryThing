package myRx;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 10/10/2019
 * Time: 4:59 PM
 */
public class MyRx<T> {
    private T t; //instance

    //call back!
    public interface IHandle<R> {
        R doSmth(R o);
    }

    public interface IChangeHandle<T,R>{
        MyRx<R> doSmth(T vl);
    }
    //-------------------------------------

    public static <U> MyRx<U> create(U initValue) {
        MyRx<U> fds = new MyRx<>();
        fds.t = initValue;
        return fds;
    }

    public MyRx<T> execute(IHandle<T> smth) {
        this.t = smth.doSmth(t);
        return this;
    }

    public <R> MyRx<R> executeChange(IChangeHandle<T,R> iChangeHandle){
        return iChangeHandle.doSmth(t);
    }



    public T getValue(){
        return t;
    }


}
