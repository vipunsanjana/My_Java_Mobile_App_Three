package com.example.myappthree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<String> names_list;
    private LayoutInflater inflater;
    private ItemClickListener itemClickListener;

    public RecyclerViewAdapter(Context mContext, ArrayList<String> names_list, ItemClickListener itemClickListener) {
        this.mContext = mContext;
        this.names_list = names_list;
        this.itemClickListener = itemClickListener;
        this.inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_recyclerview, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(names_list.get(position));

        holder.itemView.setOnClickListener(view -> {
            itemClickListener.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return names_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_contact;
        TextView tv_name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_contact = itemView.findViewById(R.id.iv_contact);
            tv_name = itemView.findViewById(R.id.tv_name);
        }
    }

    public interface ItemClickListener {
        void onItemClick(int position);
    }
}
