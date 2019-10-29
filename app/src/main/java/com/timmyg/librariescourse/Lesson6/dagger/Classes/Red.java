package com.timmyg.librariescourse.Lesson6.dagger.Classes;

import android.util.Log;

import com.timmyg.librariescourse.Lesson6.dagger.app.App;

import javax.inject.Inject;


public class Red {

    private static final String TAG = "Red";

    @Inject
    Green green;

    public Red() {
        App.getAppComponent().inject(this);
        Log.i(TAG, green.show());
        Log.i(TAG, " "+green);
    }

}
