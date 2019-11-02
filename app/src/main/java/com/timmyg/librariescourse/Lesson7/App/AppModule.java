package com.timmyg.librariescourse.lesson7.app;


import android.app.Application;
import android.content.Context;

import com.timmyg.librariescourse.lesson7.model.RetrofitDaggerApi;

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



