package com.timmyg.librariescourse.app;

import com.timmyg.librariescourse.lesson7.model.RetrofitDaggerApi;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    @Provides
    public RetrofitDaggerApi provideRetrofitApi() {
        return Mockito.mock(RetrofitDaggerApi.class);
    }
}
