package com.example.lixiang.dailypic2_android.adapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiang on 2017/12/22.
 */

public class MeListviewAdapter extends BaseAdapter {
    private static final int TYPE_MY_ORDER = 0;
    private static final int TYPE_FUNCTION = 1;
    private static final int TYPE_OTHER = 2;
    private Context context;
    private List<String> contentName;

    public MeListviewAdapter(Context context, List<String> contentName){
        super();
        this.context = context;
        this.contentName = contentName;
    }

    @Override
    public int getCount() {
        return contentName.size();
    }

    @Override
    public Object getItem(int position) {
        return contentName.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
