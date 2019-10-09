package com.timmyg.librariescourse.Presenter;

import com.timmyg.librariescourse.MainView;
import com.timmyg.librariescourse.Model.Model;

public class MainPresenter {

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        model = new Model();
    }


    public void onButtonClick() {
        String tmp = model.getText();
        String textFromEditText = mainView.getEditText();
        String result = tmp.concat(textFromEditText);
        model.setText(result);
        mainView.setTextViewResult(result);
    }
}
