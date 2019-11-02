package com.timmyg.librariescourse.lesson7.app;


import com.timmyg.librariescourse.lesson7.presenter.RetrofitDaggerPresenter;
import com.timmyg.librariescourse.lesson7.view.RetrofitDaggerActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject (RetrofitDaggerActivity retrofitDaggerActivity);

    void inject (RetrofitDaggerPresenter retrofitDaggerpresenter);
}
