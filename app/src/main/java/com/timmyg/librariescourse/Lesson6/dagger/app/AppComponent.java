package com.timmyg.librariescourse.Lesson6.dagger.app;



import com.timmyg.librariescourse.Lesson6.dagger.Classes.Red;
import com.timmyg.librariescourse.Lesson6.dagger.Classes.White;
import com.timmyg.librariescourse.Lesson6.dagger.DaggerActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(DaggerActivity daggerActivity);


    void inject(Red red);

    void inject(White white);

}
