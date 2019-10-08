package com.timmyg.librariescourse.ProjectLesson1.Model;

import com.timmyg.librariescourse.R;

import java.util.ArrayList;
import java.util.List;

public class ModelProject {

    private int count=0;
    private List<Integer> data;

    public List<Integer> getData() {
        return data;
    }

    public ModelProject(Integer drawable) {

        data = new ArrayList<>();
        data.add(drawable);
        data.add(drawable);
        data.add(drawable);
        data.add(drawable);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}



