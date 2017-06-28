package com.cardviewtest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cardviewtest.R;
import com.cardviewtest.bean.Fruit;

import java.util.List;

/**
 * Created by ${王sir} on 2017/6/28.
 * application
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private List<Fruit> fruits;
    private Context context;

    public MyRecyclerViewAdapter(List<Fruit> fruits, Context context){
        this.fruits = fruits;
        this.context = context;
    }


    @Override//加载布局 获取viewHolder
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.fruit, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = fruits.get(position);
        Glide.with(context).load(fruit.getImageId()).into(holder.imageView);
        holder.textView.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.fruit_iv);
            textView = itemView.findViewById(R.id.fruit_tv);
        }
    }
}
