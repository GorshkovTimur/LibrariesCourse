package com.timmyg.librariescourse.ProjectLesson1.Presenter;

import com.timmyg.librariescourse.ProjectLesson1.View.ViewHolderInterface;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface PresenterInterface extends MvpView {
        int getItemCount();
        int getCount();

        @StateStrategyType(value = AddToEndSingleStrategy.class)
        void bindView(ViewHolderInterface iViewHolder);
        void sendModelClick();

}

