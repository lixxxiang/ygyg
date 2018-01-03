package com.example.lixiang.dailypic2_android.adapter;

import android.annotation.SuppressLint;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lixiang.dailypic2_android.util.GlideImageLoader;
import com.example.lixiang.dailypic2_android.R;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by lixiang on 2017/12/13.
 */

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_BANNER = 0;
    private static final int TYPE_DAILY_PIC_ENTRANCE = 1;
    private static final int TYPE_SCROLL = 2;
    private static final int TYPE_THREE = 3;
    private static final int TYPE_LIKE = 4;

    List<String> bannerContent = new ArrayList<>();
    private ArrayList<String> images = new ArrayList<>();
    private String url = "http://202.111.178.10:28085/upload/image/201711151645000412863_thumb.jpg";

    public HomeAdapter(List<String> bannerContent) {
        this.bannerContent = bannerContent;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return TYPE_BANNER;
            case 1:
                return TYPE_DAILY_PIC_ENTRANCE;
            case 2:
                return TYPE_SCROLL;
            case 3:
                return TYPE_THREE;
            default:
                return TYPE_LIKE;
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_BANNER:
                View view0 = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_banner, parent, false);
                return new TypeBannerViewHolder(view0);
            case TYPE_DAILY_PIC_ENTRANCE:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_daily_pic_entrance, parent, false);
                return new Type1ViewHolder(view);
            case TYPE_SCROLL:
                View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_scroll, parent, false);
                return new TypeScrollViewHolder(view2);
            case TYPE_THREE:
                View view4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_three, parent, false);
                return new TypeThreeViewHolder(view4);
            case TYPE_LIKE:
                View view5 = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_like, parent, false);
                return new TypeLikeViewHolder(view5);
            default:
                return new TypeLikeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_like, parent, false));

        }
//        return null;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof TypeBannerViewHolder) {
            TypeBannerViewHolder bannerHolder = (TypeBannerViewHolder) holder;
            images.addAll(bannerContent);
            bannerHolder.banner.setImageLoader(new GlideImageLoader());
            bannerHolder.banner.setImages(images);
            bannerHolder.banner.setBannerStyle(BannerConfig.NOT_INDICATOR);
//            bannerHolder.banner.setBannerTitles(titles);
            bannerHolder.banner.start();
//        bannerHolder.banner.setOnBannerListener(this);
            bannerHolder.banner.startAutoPlay();
            System.out.println("________>>>" + bannerContent.get(0));
        } else if (holder instanceof TypeScrollViewHolder) {
            ((TypeScrollViewHolder) holder).recyclerView.setLayoutManager(new LinearLayoutManager(((TypeScrollViewHolder) holder).recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
            new GravitySnapHelper(Gravity.START).attachToRecyclerView(((TypeScrollViewHolder) holder).recyclerView);
            ((TypeScrollViewHolder) holder).recyclerView.setAdapter(new HomeDetailAdapter());
        } else if (holder instanceof TypeLikeViewHolder) {
            ((TypeLikeViewHolder) holder).recyclerView_like.addItemDecoration(new RecyclerViewSpacesItemDecoration());
            ((TypeLikeViewHolder) holder).recyclerView_like.setLayoutManager(new GridLayoutManager(((TypeLikeViewHolder) holder).recyclerView_like.getContext().getApplicationContext(), 2));
            ((TypeLikeViewHolder) holder).recyclerView_like.setAdapter(new LikeDetailAdapter());
        }
    }


    @Override
    public int getItemCount() {
        return 400;
    }

    public class TypeThreeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public TypeThreeViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            Log.d("App", mApps.get(getAdapterPosition()).getName());
        }
    }

    class Type1ViewHolder extends RecyclerView.ViewHolder {

        TextView pic1Name;

        Type1ViewHolder(View itemView) {
            super(itemView);
//            pic1Name = itemView.findViewById(R.id.pic1name);
        }
    }

    public class TypeScrollViewHolder extends RecyclerView.ViewHolder {

        public RecyclerView recyclerView;

        public TypeScrollViewHolder(View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.recyclerview_scroll);
        }
    }

    public class TypeBannerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        Banner banner;

        public TypeBannerViewHolder(View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.banner);
        }

        @Override
        public void onClick(View v) {
//            Log.d("App", mApps.get(getAdapterPosition()).getName());
        }
    }

    public class TypeLikeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public RecyclerView recyclerView_like;

        public TypeLikeViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            recyclerView_like = itemView.findViewById(R.id.recyclerview_like);
        }

        @Override
        public void onClick(View v) {
//            Log.d("App", mApps.get(getAdapterPosition()).getName());
        }
    }
}

