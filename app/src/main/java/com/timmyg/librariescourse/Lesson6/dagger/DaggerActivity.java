package com.timmyg.librariescourse.Lesson6.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.timmyg.librariescourse.Lesson6.Classes.Green;
import com.timmyg.librariescourse.R;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger2);
    }
}
