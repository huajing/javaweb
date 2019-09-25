package c.c.k;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;

public class RxJavaTest {
    public static void main(String[] args) {
        /*Observable<String> switcher = Observable.create(new Observable.OnSubscribe<String>(){
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("on");
                subscriber.onNext("on");
                subscriber.onNext("on");
            }
        });

        Observable.just("on", "off", "on", "on");

        Subscriber<String> lingter = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext");
            }
        };

        switcher.subscribe(lingter);*/
    }
}
