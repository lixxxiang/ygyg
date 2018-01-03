package com.example.lixiang.dailypic2_android.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lixiang.dailypic2_android.R;


/**
 * Created by lixiang on 2017/12/18.
 */

public class HomeDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_scroll_detail, parent, false);
                return new TypeScrollViewHolder(view3);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 4;
    }



    public class TypeScrollViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView scrollTitle;
        public TextView scrollDetail;
        public ImageView scrollPic;

        public TypeScrollViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            scrollTitle = itemView.findViewById(R.id.recyclerView_scroll_title);
            scrollDetail = itemView.findViewById(R.id.recyclerView_scroll_detail);
            scrollPic = itemView.findViewById(R.id.recyclerView_scroll_pic);
        }

        @Override
        public void onClick(View v) {
//            Log.d("App", mApps.get(getAdapterPosition()).getName());
        }
    }



}
