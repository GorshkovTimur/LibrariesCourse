package com.timmyg.librariescourse.ProjectLesson1.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.timmyg.librariescourse.ProjectLesson1.Presenter.Presenter;
import com.timmyg.librariescourse.R;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class ProjectActivity extends MvpAppCompatActivity {


    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(presenter.getRecyclerPresenter());
        recyclerView.setAdapter(myAdapter);
    }

}
