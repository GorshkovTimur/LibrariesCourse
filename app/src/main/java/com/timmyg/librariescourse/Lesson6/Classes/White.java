package com.timmyg.librariescourse.Lesson6.Classes;

import android.util.Log;

public class White {

    private static final String TAG = "Red";

    public White() {
        Green green = new Green();
        Log.i(TAG, green.show());
        Log.i(TAG, " "+green);
        }

    public White (Green green){
        Log.i(TAG, green.show());
        Log.i(TAG, " "+green);
    }

}

