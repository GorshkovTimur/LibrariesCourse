package com.timmyg.librariescourse.Lesson2.Observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.timmyg.librariescourse.R;

public class ObserverActivity extends AppCompatActivity {

    private Publisher slack;
    private Subscriber me;

    private Button button_subscribe;
    private Button button_unsubscribe;
    private Button button_spam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        slack = new Publisher();
        me = new Subscriber("Timur G.");


        initUI();


    }

    private void initUI() {
        button_subscribe = findViewById(R.id.subscribe);
        button_unsubscribe = findViewById(R.id.unsubscribe);
        button_spam = findViewById(R.id.spam);

        button_subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slack.subscribe(me);
            }
        });

        button_unsubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slack.unsubscribe(me);
            }
        });

        button_spam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slack.notifyScribers();
            }
        });
    }
}
