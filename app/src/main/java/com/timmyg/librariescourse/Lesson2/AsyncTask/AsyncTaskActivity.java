package com.timmyg.librariescourse.Lesson2.AsyncTask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.timmyg.librariescourse.R;

import java.util.concurrent.TimeUnit;

public class AsyncTaskActivity extends AppCompatActivity {

    private final String TAG = "AsyncTask";

    Button asyncButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        asyncButton = findViewById(R.id.async_button);

        asyncButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyAsyncTask task = new MyAsyncTask();
                task.execute();
                Log.i(TAG, "Thread " + Thread.currentThread().getName()+" is finish");
            }
        });

    }

    private class MyAsyncTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 0; i < 5 ; i++) {
                Log.i(TAG, "Thread " + Thread.currentThread().getName()+" is running at " + i + " circles");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }
    }
}
