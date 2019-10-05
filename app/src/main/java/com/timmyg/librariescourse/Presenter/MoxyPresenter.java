package com.timmyg.librariescourse.Presenter;


import com.timmyg.librariescourse.Model.Model;
import com.timmyg.librariescourse.SecondView;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<SecondView> {

    private Model model;


    public MoxyPresenter() {
        model = new Model();
    }


    public void onButtonClick() {
        String tmp = model.getText();
        String textFromEditText = getViewState().getEditText();
        String result = tmp.concat(textFromEditText);
        model.setText(result);
        getViewState().setTextViewResult(result);
    }
}
