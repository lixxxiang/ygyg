package com.example.lixiang.dailypic2_android.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lixiang.dailypic2_android.R;
import com.example.lixiang.dailypic2_android.model.entity.HomePageUnits;

import java.util.ArrayList;


/**
 * Created by lixiang on 2017/12/18.
 */

public class HomeDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private HomePageUnits.DataBean unitContent = new HomePageUnits.DataBean();

    public HomeDetailAdapter(HomePageUnits.DataBean unitContent) {
        this.unitContent = unitContent;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_scroll_detail, parent, false);
                return new TypeScrollViewHolder(view3);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        System.out.println("fuck title" + unitContent.getPieces().get(0).getPosTitle());
        TypeScrollViewHolder typeScrollViewHolder = (TypeScrollViewHolder) holder;
        typeScrollViewHolder.scrollTitle.setText(unitContent.getPieces().get(position).getPosTitle());
        typeScrollViewHolder.scrollDetail.setText(unitContent.getPieces().get(position).getPosDescription());
        typeScrollViewHolder.scrollPic.setImageURI(Uri.parse(unitContent.getPieces().get(position).getImageUrl()));
    }


    @Override
    public int getItemCount() {
        return unitContent.getPieces().size();
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
