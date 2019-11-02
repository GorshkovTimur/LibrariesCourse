package com.timmyg.librariescourse.Lesson6.dagger.app;


import com.timmyg.librariescourse.Lesson6.dagger.DaggerActivity;
import com.timmyg.librariescourse.Lesson6.dagger.Red4Dagger;
import com.timmyg.librariescourse.Lesson6.dagger.White4Dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject (DaggerActivity daggerActivity);

    void inject (Red4Dagger red4Dagger);

    void inject (White4Dagger white4Dagger);
}
