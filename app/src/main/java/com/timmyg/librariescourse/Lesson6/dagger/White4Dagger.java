package com.timmyg.librariescourse.Lesson6.dagger;

import android.util.Log;
import android.widget.TextView;

import com.timmyg.librariescourse.Lesson6.Classes.Green;
import com.timmyg.librariescourse.Lesson6.dagger.app.App;

import javax.inject.Inject;

public class White4Dagger {

    private static final String TAG = "White4Dagger";

    @Inject
    Green green;

    public White4Dagger() {
        App.getAppComponent().inject(this);
        Log.i(TAG, green.show());
    }
}
