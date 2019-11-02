package com.timmyg.librariescourse.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

import com.timmyg.librariescourse.R;

public class LeakActivity extends AppCompatActivity {

    private static final String TAG = "LeakActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        start();
    }

    private void start() {
        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                for (int i = 0; i < 30; i++) {
                    Log.d(TAG, "doInBackground: " + LeakActivity.this);
                    SystemClock.sleep(1000);
                }
                return null;
            }
        }.execute();
    }
}
