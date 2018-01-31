package rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/**
 * Created by huang_jiangling on 2018/1/26.
 */
public class Rx_6_zip {
    public static void main(String[] args) {
        Observable<Integer> observable1 = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(12);
            }
        });
        Observable<Integer> observable2 = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(17);
            }
        });
        Observable.zip(observable1, observable2, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer integer, Integer integer2) throws Exception {
                return integer + "-" + integer2;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);
            }
        });
    }
}
