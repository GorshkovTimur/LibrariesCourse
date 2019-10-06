package com.timmyg.librariescourse;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {

    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setTextViewResult(String valueForConcat);
    void getEditText();

}
