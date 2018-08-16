package rxJava;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainClass {
    public static void main(String[] args) {
        composeOperator();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //
    private static void createOperator() {
        //create operator
        //need to call onNext and complete by yourself
        Disposable d = Observable.create(emitter -> {
            emitter.onNext(123);
            //emitter.onComplete();
        }).subscribe(result -> {
                    System.out.println(result);
                },
                err -> {

                });
    }
    //
    private static void composeOperator(){
        Disposable d = Observable.just(1,2,3)
                .compose(tranformerDemo())
                .subscribe(System.out::println);
    }
    //
    private static <T> ObservableTransformer<T,Integer> tranformerDemo(){
        return upstream -> upstream.flatMap(xx->{
            return Observable.just(1);
        });//subscribeOn(Schedulers.io());
    }

    private static Observable<Integer> flatMapDemo(){
        return Observable.just(10).subscribeOn(Schedulers.io());
    }
}
