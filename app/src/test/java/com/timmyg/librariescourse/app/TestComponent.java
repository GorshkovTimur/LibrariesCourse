package com.timmyg.librariescourse.app;

import com.timmyg.librariescourse.lesson7.presenter.RetrofitDaggerPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = TestModule.class)
public interface TestComponent {

    void inject (RetrofitDaggerPresenter presenter);
}
