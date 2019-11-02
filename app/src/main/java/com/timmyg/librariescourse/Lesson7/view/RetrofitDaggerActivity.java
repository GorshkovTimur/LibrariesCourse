package com.timmyg.librariescourse.Lesson7.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.timmyg.librariescourse.Lesson7.App.App;
import com.timmyg.librariescourse.Lesson7.presenter.RetrofitDaggerPresenter;
import com.timmyg.librariescourse.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class RetrofitDaggerActivity extends MvpAppCompatActivity implements RetrofitView {


    private static final String TAG = "RetrofitDaggerActivity";

    @BindView(R.id.text_view_name_activity_retrofit)
    TextView textViewName;

    @InjectPresenter
    RetrofitDaggerPresenter retrofitDaggerPresenter;

    @ProvidePresenter
    public RetrofitDaggerPresenter providePresenter(){
        retrofitDaggerPresenter = new RetrofitDaggerPresenter();
        App.getAppComponent().inject(retrofitDaggerPresenter);
        return retrofitDaggerPresenter;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_dagger);
        ButterKnife.bind(this);
        App.getAppComponent().inject(this);
    }

    @OnClick(R.id.button_activity_retrofit)
    public void onClickButton(View view){
        Log.d(TAG, "onClickButton");
        retrofitDaggerPresenter.getString();
    }

    @Override
    public void showName(String name) {
        textViewName.setText(name);
    }
}
