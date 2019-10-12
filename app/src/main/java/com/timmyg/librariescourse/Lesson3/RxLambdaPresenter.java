package com.timmyg.librariescourse.Lesson3;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class RxLambdaPresenter {

    public Observable<String> getMessage(){

        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                for (int i=0; i<3; i++){
                    String msg = "Hello, world";
                    emitter.onNext(msg);
                }
            }
        });
        return observable;
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


