package com.timmyg.librariescourse.Lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.timmyg.librariescourse.R;

public class NoDIActivity extends AppCompatActivity {

    private NoDiPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);
        presenter = new NoDiPresenter();

    }
}
