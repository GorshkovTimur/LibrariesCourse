package com.timmyg.librariescourse.Lesson2.RxJava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class RxPresenter {



    public Observable<String> getMessage() {

        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                for (int i = 0; i < 3; i++) {
                    String msg = "Hello, world";
                    emitter.onNext(msg);
                }
            }
        });
        return observable;
    }
}
