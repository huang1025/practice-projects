package rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/**
 * Created by huang_jiangling on 2018/1/25.
 */
public class Rx_3_subscribe {

    /**
     * subsribe 方法还可以接受别的参数
     * 1，能接收 consumer 接口的实现类，这个接口中只有一个 accept 方法，表示只关心 onNext 事件，当调用 onNext 时，将会调用 accept 方法；
     * 2，当有两个参数时，表示调用 onError 方法时，会调用第二个 consumer；
     */
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                for (int i = 0; i < 10; i++) {
                    emitter.onNext(i);
                    System.out.println("subscribe:" + i);
                }
                emitter.onError(new RuntimeException("sb,you have error;"));
            }
        }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println("consumer1:" + integer);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                System.out.println("consumer2:" + throwable.getMessage());
            }
        });
    }
}
