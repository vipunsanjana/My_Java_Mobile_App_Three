package com.example.myappthree;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    private Context m_context;
    private ArrayList<String> num_list;

    public GridViewAdapter(Context context, ArrayList<String> num_list ) {

        this.m_context = context;
        this.num_list = num_list;
    }

    @Override
    public int getCount() {
        return num_list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
