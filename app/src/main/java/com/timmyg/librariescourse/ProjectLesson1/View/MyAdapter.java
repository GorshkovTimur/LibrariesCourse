package com.timmyg.librariescourse.ProjectLesson1.View;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.timmyg.librariescourse.ProjectLesson1.Presenter.PresenterInterface;
import com.timmyg.librariescourse.R;

import moxy.presenter.InjectPresenter;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private final String INFO = "INFO";

    private PresenterInterface presenter;

    public MyAdapter(PresenterInterface presenter) {
        this.presenter = presenter;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.position = position;
        presenter.bindView(holder);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.sendModelClick();
                Log.i(INFO, String.valueOf(presenter.getCount()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return presenter.getItemCount();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements ViewHolderInterface {

        private ImageView imageView;
        private int position = 0;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
        }

        @Override
        public void setImage(int image) {
        imageView.setImageResource(image);
        }

        @Override
        public int getPos() {
            return position;
        }
    }

}
