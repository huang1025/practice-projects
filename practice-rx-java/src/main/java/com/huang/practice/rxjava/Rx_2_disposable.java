package com.huang.practice.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by huang_jiangling on 2018/1/25.
 */
public class Rx_2_disposable {

    /**
     * 当调用 Disposable 后，事件会继续发送，但是观察者已经不会接收了；
     */
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                for (int i = 0; i < 10; i++) {
                    System.out.println("发送事件：" + i);
                    emitter.onNext(i);
                }
            }
        }).subscribe(new Observer<Integer>() {

            private Disposable disposable;

            @Override
            public void onSubscribe(Disposable d) {
                this.disposable = d;
            }

            @Override
            public void onNext(Integer integer) {
                if (integer == 6) {
                    disposable.dispose();
                    System.out.println("调用dispose方法，integer：" + integer);
                } else {
                    System.out.println("onNext:" + integer);
                }
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
