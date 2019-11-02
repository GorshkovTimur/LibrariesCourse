package com.timmyg.librariescourse.Lesson6.Classes;

import android.util.Log;

public class Red {


    private static final String TAG = "Red";

    public Red() {
        Green green = new Green();
        Log.i(TAG, green.show());
        Log.i(TAG, " "+green);
    }

    public Red (Green green){
        Log.i(TAG, green.show());
        Log.i(TAG, " "+green);
    }

}
