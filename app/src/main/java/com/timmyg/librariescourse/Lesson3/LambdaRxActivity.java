package com.timmyg.librariescourse.Lesson3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.timmyg.librariescourse.R;


import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class LambdaRxActivity extends AppCompatActivity {

    private final String TAG = "RxTAG";

    private RxLambdaPresenter presenter;
    private Observable<String> observable;
    private Disposable disposable;
    private Disposable singleDispose;
    private Single<String> single;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lambda_rx);
        ButterKnife.bind(this);
        presenter = new RxLambdaPresenter();

        observable = presenter.getUberMessage();
        single = presenter.getMessage();

    }

    @OnClick(R.id.button_subscribe_lambda)
    public void doClick(View view){
        disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe((string)->{
                    Log.i(TAG, string);},
                throwable -> {
                    Log.i(TAG, "onError");
                },
                ()-> Log.i(TAG, "onComplete"));
    }

    @OnClick(R.id.button_unsubscribe_lambda)
    public void onClick(View view){
        disposable.dispose();
    }

    @OnClick(R.id.single_subcribe)
    public void onButtonClick(View view){
        singleDispose = single.observeOn(AndroidSchedulers.mainThread()).subscribe((string)-> {
                    Log.i(TAG, "OnComplete"+string);
                },throwable -> {
            Log.i(TAG, "OnError");
                });
        }
}










