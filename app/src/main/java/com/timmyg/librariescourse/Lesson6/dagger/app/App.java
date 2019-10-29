package com.timmyg.librariescourse.Lesson6.dagger.app;


import android.app.Application;

public class App extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = generateAppComponent();
    }

    public AppComponent generateAppComponent() {
        return DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }



    public static AppComponent getAppComponent() {
        return appComponent;
    }


}
