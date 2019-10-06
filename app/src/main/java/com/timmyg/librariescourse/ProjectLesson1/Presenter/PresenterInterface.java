package com.timmyg.librariescourse.ProjectLesson1.Presenter;

import com.timmyg.librariescourse.ProjectLesson1.View.ViewHolderInterface;

public interface PresenterInterface {
        void bindView(ViewHolderInterface iViewHolder);
        int getItemCount();
        void sendModelClick();
        int getCount();
}

