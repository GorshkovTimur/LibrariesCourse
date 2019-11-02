package com.timmyg.librariescourse.Lesson4.GSON;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.timmyg.librariescourse.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class GsonActivity extends AppCompatActivity implements Viewable {

    private final String GSON_STRING = "{\"time_of_year\": \"summer\", \"year\": 2019}";
    private static final String TAG = "GsonActivity";

    private GSonPresenter gSonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);
        ButterKnife.bind(this);
        gSonPresenter = new GSonPresenter(this);
    }

    @OnClick(R.id.button_parse)
    public void onClick (View view){
        gSonPresenter.onClick(GSON_STRING);
    }

    @Override
    public void sendLog(String log) {
        Log.i(TAG, log);
    }
}
