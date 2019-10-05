package com.timmyg.librariescourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.timmyg.librariescourse.Presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String EMPTY_TEXT = "";
    private EditText editText;
    private TextView textView;
    private Button button;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        presenter = new MainPresenter(this);
    }

    private void initViews() {
        editText = findViewById(R.id.edittext_for_concat);
        button = findViewById(R.id.button_concat);
        textView = findViewById(R.id.textview_for_result);
    }

    @Override
    public void setTextViewResult(String value) {
        textView.setText(value);

    }

    public void buttonClick(View view) {
        presenter.onButtonClick();
    }

    public String getEditText(){
        String text = editText.getText().toString();
        editText.setText(EMPTY_TEXT);
        return text;
    }
}
