package com.timmyg.librariescourse.Lesson7.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @Expose
    @SerializedName("login")
    public String login;
}
