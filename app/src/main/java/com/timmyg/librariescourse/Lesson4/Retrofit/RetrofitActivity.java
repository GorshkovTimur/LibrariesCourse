package com.timmyg.librariescourse.Lesson4.Retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.timmyg.librariescourse.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RetrofitActivity extends AppCompatActivity {

    @BindView(R.id.avatar)
    ImageView avatar;

    private RetrofitPresenter retrofitPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);
        retrofitPresenter = new RetrofitPresenter();
    }


    @OnClick(R.id.button_retrofit_get)
    public void OnClick(View view){
        retrofitPresenter.getString();
        Picasso
                .get()
                .load("https://avatars0.githubusercontent.com/u/66577?v=4")
                .into(avatar);
    }
}
