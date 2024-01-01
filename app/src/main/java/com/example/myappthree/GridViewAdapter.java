package com.example.myappthree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    private Context m_context;
    private ArrayList<String> num_list;
    private LayoutInflater inflater;

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
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(inflater == null){
            inflater = (LayoutInflater) m_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(view == null){
            view = inflater.inflate(R.layout.item_gridview, null);
        }

        TextView tv_num = view.findViewById(R.id.tv_num);
        tv_num.setText(num_list.get(position));
        return view;
    }
}
