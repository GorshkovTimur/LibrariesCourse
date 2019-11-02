package com.timmyg.librariescourse.Lesson4.Retrofit;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetrofitPresenter {

    private static final String TAG = "RetrofitPresenter";

    private RetrofitApi retrofitApi;
    String result;
    public RetrofitPresenter (){
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
           result = new String();

            Observable<String> single = retrofitApi.requestServer();
            Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(str -> {
                Log.d(TAG, "onNext: " + str);
                result=str;
                message();
            }, throwable -> {
                Log.e(TAG, "onError");
            });
        }

    public void message() {
        System.out.println(result);
    }
}
