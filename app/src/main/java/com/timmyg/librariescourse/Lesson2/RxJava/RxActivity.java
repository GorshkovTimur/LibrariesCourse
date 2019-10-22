package com.timmyg.librariescourse.Lesson2.RxJava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.timmyg.librariescourse.R;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RxActivity extends AppCompatActivity {

    private final String TAG = "RxTAG";

    private RxPresenter presenter;
    private Observable<String> observable;
    private Disposable disposable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx);
        presenter = new RxPresenter();
        observable = presenter.getMessage();
    }

    public void onButtonSubscribeClick(View view) {
        observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                RxActivity.this.disposable = d;
            }

            @Override
            public void onNext(String s) {
            Log.i(TAG, "Your message is "+ s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
            Log.i(TAG,"onComplete");
            }
        });
    }

    public void onButtonUnsubscribeClick(View view) {
        disposable.dispose();
    }
}
