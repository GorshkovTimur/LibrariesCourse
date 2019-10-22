package com.timmyg.librariescourse.Lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.timmyg.librariescourse.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RoomActivity extends AppCompatActivity {

    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        ButterKnife.bind(this);
        userPresenter = new UserPresenter();
    }

    @OnClick(R.id.button_insert)
    public void onClick (View view){
        userPresenter.insertData();
    }

    @OnClick(R.id.button_insert_list)
    public void onClickList (View view){
        userPresenter.insertList();
    }

    @OnClick(R.id.button_delete)
    public void onClickDelete (View view){
        userPresenter.deleteUser();
    }

    @OnClick(R.id.button_update)
    public void onClickUpdate (View view){
        userPresenter.updateUser();
    }


}
