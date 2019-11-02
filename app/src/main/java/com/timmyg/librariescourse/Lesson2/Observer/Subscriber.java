package com.timmyg.librariescourse.Lesson2.Observer;

import android.util.Log;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void getNotify() {
        Log.i(name,  " пришла ценнейшая информация в Slack с тегом @here");
    }
}
