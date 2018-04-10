package rxJava;

import io.reactivex.Observable;

public class MainClass {
    public static void main(String[] args) {
        createOperator();
    }

    //
    private static void createOperator() {
        //create operator
        //need to call onNext and complete by yourself
        Observable.create(emitter -> {
            emitter.onNext(123);
            //emitter.onComplete();
        }).subscribe(result -> {
                    System.out.println(result);
                },
                err -> {

                });
    }
}
