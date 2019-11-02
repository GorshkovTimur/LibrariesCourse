package com.timmyg.librariescourse.retrofitpresenter;


import com.timmyg.librariescourse.app.TestComponent;
import com.timmyg.librariescourse.app.TestModule;
import com.timmyg.librariescourse.lesson7.model.RetrofitDaggerApi;
import com.timmyg.librariescourse.lesson7.model.User;
import com.timmyg.librariescourse.lesson7.presenter.RetrofitDaggerPresenter;
import com.timmyg.librariescourse.lesson7.view.RetrofitViewImpl;

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

    private RetrofitDaggerPresenter presenter;

    @Mock
    RetrofitViewImpl retrofitView;

    @BeforeClass
    public static void setupClass(){
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(___-> Schedulers.trampoline());

    }

    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
        presenter = Mockito.spy(new RetrofitDaggerPresenter());
    }

    @Test
    public void getString_isCorrect(){
        TestComponent component = DaggerTestComponent.builder()
                .testModule(new TestModule() {

                    @Override
                    public RetrofitDaggerApi provideRetrofitApi() {
                        RetrofitDaggerApi retrofitDaggerApi = super.provideRetrofitApi();
                        User user = new User();
                        user.login = "Timur";
                        Mockito.when(retrofitDaggerApi.requestServer()).thenReturn(Observable.just(user));
                        return retrofitDaggerApi;
                    }
                }).build();
        component.inject(presenter);
        presenter.attachView(retrofitView);
        presenter.getString();
        Mockito.verify(retrofitView).showName("Timur");
    }
}
