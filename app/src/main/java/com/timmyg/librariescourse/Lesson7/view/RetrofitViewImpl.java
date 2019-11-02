package com.timmyg.librariescourse.lesson7.view;

import moxy.MvpView;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface RetrofitViewImpl extends MvpView {
    @StateStrategyType(value = SkipStrategy.class)
    void showName(String name);
}
