package com.timmyg.librariescourse;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.timmyg.librariescourse.Presenter.MoxyPresenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;


public class MainMoxyActivity extends MvpAppCompatActivity implements SecondView {

    private static final String EMPTY_TEXT = "";
    private EditText editText;
    private TextView textView;
    private Button button;

    @InjectPresenter
    MoxyPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_moxy2);
        initViews();
    }


    private void initViews() {
        editText = findViewById(R.id.edittext_for_concat);
        button = findViewById(R.id.button_concat);
        textView = findViewById(R.id.textview_for_result);
    }

    @Override
    public void setTextViewResult(String valueForConcat) {
        textView.setText(valueForConcat);
    }

    @Override
    public void getEditText() {
        String text = editText.getText().toString();
        presenter.setTextFromEditText(text);
        editText.setText(EMPTY_TEXT);
    }

    public void buttonClick(View view) {
        presenter.onButtonClick();
    }
}
