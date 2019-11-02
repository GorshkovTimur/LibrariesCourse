package com.timmyg.librariescourse.RetrofitPresenter;

import com.timmyg.librariescourse.Lesson4.Retrofit.RetrofitApi;
import com.timmyg.librariescourse.Lesson4.Retrofit.RetrofitInt;
import com.timmyg.librariescourse.Lesson4.Retrofit.RetrofitPresenter;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Observable;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;

@RunWith(MockitoJUnitRunner.class)
public class RetrofitPresenterTest {

    private RetrofitPresenter retrofitPresenter;


    @BeforeClass
    public static void setupClass() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(x -> Schedulers.trampoline());
    }

    @Before
    public void before() {
        retrofitPresenter = Mockito.spy(new RetrofitPresenter());
    }

    @Test
    public void getStringTest(){
        RetrofitApi retrofitApi = Mockito.mock(RetrofitApi.class);
        String user = "Jake";
        Mockito.when(retrofitApi.requestServer()).thenReturn(Observable.just(user));
        retrofitPresenter.getString();
        retrofitPresenter.message();
    }
}