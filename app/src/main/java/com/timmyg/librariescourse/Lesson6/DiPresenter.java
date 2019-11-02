package com.timmyg.librariescourse.Lesson6;

import android.util.Log;

import com.timmyg.librariescourse.Lesson6.Classes.Green;
import com.timmyg.librariescourse.Lesson6.Classes.Red;
import com.timmyg.librariescourse.Lesson6.Classes.White;

public class DiPresenter {

    private static final String TAG = "DiPresenter";


    private Green green;
    private Red red;
    private White white;


    public DiPresenter() {
        green = new Green();
        red = new Red(green);
        white = new White(green);
        Log.i(TAG, " "+green);
        Log.i(TAG," "+ red);
        Log.i(TAG," " + white );
    }


}
