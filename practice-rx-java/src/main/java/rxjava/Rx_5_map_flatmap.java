package rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by huang_jiangling on 2018/1/25.
 */
public class Rx_5_map_flatmap {
    public static void main(String[] args) {
        concatmap();
    }

    private static void map() {
        Observable.create((ObservableOnSubscribe<Date>) emitter -> {
            Date date = new Date();
            System.out.println("subscribe:" + date);
            emitter.onNext(date);
        }).map(date -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date)).subscribe(date -> {
            System.out.println("accept:" + date);
        });
    }

    private static void flatmap() {
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                System.out.println("subscribe");
                emitter.onNext("10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27");
            }
        }).flatMap(new Function<String, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(String s) throws Exception {
                System.out.println("apply");
                String[] split = s.split(",");
                return Observable.fromArray(split);
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println("accept");
                System.out.println(s);
            }
        });
    }

    private static void concatmap() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(12);
            }
        }).concatMap(new Function<Integer, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(Integer integer) throws Exception {
                System.out.println("apply");
                return Observable.fromArray("huang" + integer, "jiang" + integer, "ling" + integer);
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println("accept:" + s);
            }
        });
    }
}
