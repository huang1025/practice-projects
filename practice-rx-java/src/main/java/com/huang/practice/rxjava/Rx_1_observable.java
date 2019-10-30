package com.huang.practice.rxjava;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by huang_jiangling on 2018/1/24.
 */
public class Rx_1_observable {

    private static Integer num = 0;

    /**
     * 当订阅时（subscribe方法调用时），会调用 observable 中的 subscript 方法中的内容；
     * 1，onNext 方法可以随意调用任意次；
     * 2，onComplete 或 onError 方法，能且只能调用一次，后面的事件将不会再发送；
     */
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe：" + d.isDisposed());
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("onNext:" + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println(e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("complete");
            }
        });
    }
}
