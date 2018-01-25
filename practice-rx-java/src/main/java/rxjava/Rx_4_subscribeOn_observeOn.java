package rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by huang_jiangling on 2018/1/25.
 */
public class Rx_4_subscribeOn_observeOn {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                for (int i = 0; i < 9; i++) {
                    System.out.println(Thread.currentThread().getName() + "-subscribe:" + i);
                    emitter.onNext(i);
                }
            }
        }).observeOn(Schedulers.newThread()).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(Thread.currentThread().getName() + "-accept:" + integer);
            }
        });
    }
}
