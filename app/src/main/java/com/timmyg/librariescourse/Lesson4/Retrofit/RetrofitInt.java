package com.timmyg.librariescourse.Lesson4.Retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitInt {
    @GET("/users/JakeWharton")
    Observable<String> getUser();
}
