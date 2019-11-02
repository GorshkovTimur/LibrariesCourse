package com.timmyg.librariescourse.Lesson4.GSON;

import androidx.annotation.NonNull;

public class TimeOfYear {

    private String time_of_year;
    private String year;

    public TimeOfYear() {
    }

    public String getTime_of_year() {
        return time_of_year;
    }

    public String getYear() {
        return year;
    }

    @NonNull
    @Override
    public String toString() {
        return "Year - "+year+" season " + time_of_year;
    }
}
