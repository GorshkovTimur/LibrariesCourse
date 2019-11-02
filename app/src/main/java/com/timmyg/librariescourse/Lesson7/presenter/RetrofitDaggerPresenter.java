package com.timmyg.librariescourse.Lesson7.presenter;

import android.util.Log;

import com.timmyg.librariescourse.Lesson7.model.RetrofitDaggerApi;
import com.timmyg.librariescourse.Lesson7.model.User;
import com.timmyg.librariescourse.Lesson7.view.RetrofitView;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class RetrofitDaggerPresenter extends MvpPresenter<RetrofitView> {

    private static final String TAG = "RetrofitDaggerPresenter";

    @Inject
    RetrofitDaggerApi retrofitDaggerApi;

    public void getString() {
        Disposable disposable = getUserObservable().observeOn(AndroidSchedulers.mainThread()).subscribe(user ->{
            Log.d(TAG, "onNext" + user.login);
            getViewState().showName(user.login);

        }, throwable -> {
            Log.e(TAG, "onError");
        });
    }

    public Observable<User> getUserObservable() {return retrofitDaggerApi.requestServer();}
}
