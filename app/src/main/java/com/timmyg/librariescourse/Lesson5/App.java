package com.timmyg.librariescourse.Lesson5;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {

    private static AppDataBase appDataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        appDataBase = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "user_db").build();
    }

    public static AppDataBase getAppDataBase() {
        return appDataBase;
    }
}
