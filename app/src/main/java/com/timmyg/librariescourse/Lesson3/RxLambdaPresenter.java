package com.timmyg.librariescourse.Lesson3;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

public class RxLambdaPresenter {

    public Single<String> getMessage() {

        Single<String> single = Single.create(new SingleOnSubscribe<String>() {
            @Override
            public void subscribe(SingleEmitter<String> emitter) throws Exception {
                for (int i = 0; i < 3; i++) {
                    String msg = "Hello, world";
                    emitter.onSuccess(msg);
                }
            }
        });
        return single;
    }



        public  Observable<String> getUberMessage(){
        Observable<String> obs = Observable.create((lambda)->{
           for (int i=0; i<3; i++){
               String msg = "Hello lambda";
               lambda.onNext(msg);
           }
        });
        return obs;
    }



}


