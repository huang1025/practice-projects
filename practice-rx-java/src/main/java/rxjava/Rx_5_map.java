package rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by huang_jiangling on 2018/1/25.
 */
public class Rx_5_map {
    public static void main(String[] args) {
        Observable.create((ObservableOnSubscribe<Date>) emitter -> {
            Date date = new Date();
            System.out.println("subscribe:" + date);
            emitter.onNext(date);
        }).map(date -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date)).subscribe(date -> {
            System.out.println("accept:" + date);
        });
    }
}
