package com.timmyg.librariescourse.Lesson6;

import android.util.Log;

import com.timmyg.librariescourse.Lesson6.Classes.Green;
import com.timmyg.librariescourse.Lesson6.Classes.Red;
import com.timmyg.librariescourse.Lesson6.Classes.White;

public class NoDiPresenter {

    private static final String TAG = "NoDiPresenter";

    private Green green;
    private Red red;
    private White white;


    public NoDiPresenter() {
        green = new Green();
        red = new Red();
        white = new White();
        Log.i(TAG, " "+green);
        Log.i(TAG," "+ red);
        Log.i(TAG," " + white );
    }
}
