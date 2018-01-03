package com.example.lixiang.dailypic2_android.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.lixiang.dailypic2_android.R;

import java.util.HashMap;

public class RecyclerViewSpacesItemDecoration extends RecyclerView.ItemDecoration {

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {
        outRect.bottom = 26;
    }
}