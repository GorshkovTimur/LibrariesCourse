package com.timmyg.librariescourse.Lesson7.App;


import android.app.Application;
import android.content.Context;

import com.timmyg.librariescourse.Lesson7.model.RetrofitDaggerApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

    private final Application application;

    public AppModule(Application application){this.application = application;}

    @Provides
    @Singleton
    Context provideAppContext(){return application.getApplicationContext();}

    @Provides
    @Singleton
    RetrofitDaggerApi provideRetrofitDaggerApi(){return new RetrofitDaggerApi();}

}



