package com.timmyg.librariescourse.Lesson6.dagger.app;

import android.app.Application;

import com.timmyg.librariescourse.Lesson6.Classes.Green;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

@Singleton
@Provides
    Green provideGreen() {return new Green();}
}
