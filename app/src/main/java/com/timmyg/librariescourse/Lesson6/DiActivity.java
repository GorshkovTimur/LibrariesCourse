package com.timmyg.librariescourse.Lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.timmyg.librariescourse.R;

public class DiActivity extends AppCompatActivity {

    private DiPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);
        presenter = new DiPresenter();
    }
}
