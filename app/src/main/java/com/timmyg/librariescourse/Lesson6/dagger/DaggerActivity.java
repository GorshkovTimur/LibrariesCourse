package com.timmyg.librariescourse.Lesson6.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.timmyg.librariescourse.Lesson6.dagger.Classes.Green;
import com.timmyg.librariescourse.Lesson6.dagger.Classes.Red;
import com.timmyg.librariescourse.Lesson6.dagger.Classes.White;
import com.timmyg.librariescourse.Lesson6.dagger.app.App;
import com.timmyg.librariescourse.R;

import javax.inject.Inject;


public class DaggerActivity extends AppCompatActivity {

    private static final String TAG = "DaggerActivity";

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        App.getAppComponent().inject(this);

        Red red = new Red();
        White white = new White();
    }
}
