package com.timmyg.librariescourse.Lesson7.App;


import com.timmyg.librariescourse.Lesson7.presenter.RetrofitDaggerPresenter;
import com.timmyg.librariescourse.Lesson7.view.RetrofitDaggerActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject (RetrofitDaggerActivity retrofitDaggerActivity);

    void inject (RetrofitDaggerPresenter retrofitDaggerpresenter);
}
