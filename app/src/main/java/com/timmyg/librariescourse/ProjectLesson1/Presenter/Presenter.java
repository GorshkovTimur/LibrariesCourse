package com.timmyg.librariescourse.ProjectLesson1.Presenter;

import com.timmyg.librariescourse.ProjectLesson1.Model.ModelProject;
import com.timmyg.librariescourse.ProjectLesson1.View.ViewHolderInterface;
import com.timmyg.librariescourse.R;

import moxy.InjectViewState;
import moxy.MvpPresenter;

public class Presenter extends MvpPresenter<PresenterInterface> {


    RecyclerPresenter recyclerPresenter = new RecyclerPresenter();

    @InjectViewState
    private class RecyclerPresenter implements PresenterInterface{

        ModelProject modelProject = new ModelProject(R.drawable.biohazard);



        @Override
        public void bindView(ViewHolderInterface iViewHolder) {
        iViewHolder.setImage(modelProject.getData().get(iViewHolder.getPos()));

        }

        @Override
        public int getItemCount() {
            return modelProject.getData().size();
        }

        @Override
        public void sendModelClick() {
            int countValue = modelProject.getCount();
            modelProject.setCount(++countValue);
        }

        @Override
        public int getCount() {
            return modelProject.getCount();
        }
    }


    public RecyclerPresenter getRecyclerPresenter() {
        return recyclerPresenter;
    }

}
