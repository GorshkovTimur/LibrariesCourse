package com.timmyg.librariescourse.Lesson4.GSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSonPresenter {

    private Gson gson;


    private TimeOfYear timeOfYear;
    private Viewable viewable;

    public GSonPresenter(Viewable viewable) {
        this.timeOfYear = new TimeOfYear();
        this.viewable = viewable;
    }

    public void onClick(String string2Parse){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();
        timeOfYear = gson.fromJson(string2Parse, TimeOfYear.class);
        viewable.sendLog(timeOfYear.toString());
    }


}
