package com.timmyg.librariescourse.Lesson6.dagger;

import android.util.Log;

import com.timmyg.librariescourse.Lesson6.Classes.Green;
import com.timmyg.librariescourse.Lesson6.dagger.app.App;

import javax.inject.Inject;

public class Red4Dagger {

    private static final String TAG = "Red4Dagger";

    @Inject
    Green green;

    public Red4Dagger() {
        App.getAppComponent().inject(this);
        Log.i(TAG, green.show());
    }
}
