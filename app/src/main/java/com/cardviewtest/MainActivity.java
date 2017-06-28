package com.cardviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cardviewtest.adapter.MyRecyclerViewAdapter;
import com.cardviewtest.bean.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView mMrecyclerview;
    List<Fruit> fruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        initData();
        initView();

    }

    private void initData() {
        for (int i = 0; i < 5; i++) {
            Fruit apple = new Fruit("苹果",R.drawable.apple);
            fruits.add(apple);
            Fruit caomei = new Fruit("caomei",R.drawable.caomei);
            fruits.add(caomei);
            Fruit chengzi = new Fruit("chengzi",R.drawable.chengzi);
            fruits.add(chengzi);
            Fruit hamigua = new Fruit("hamigua",R.drawable.hamigua);
            fruits.add(hamigua);
            Fruit huolongguo = new Fruit("huolongguo",R.drawable.huolongguo);
            fruits.add(huolongguo);
            Fruit li = new Fruit("li",R.drawable.li);
            fruits.add(li);
            Fruit ningmeng = new Fruit("ningmeng",R.drawable.ningmeng);
            fruits.add(ningmeng);
            Fruit taozi = new Fruit("taozi",R.drawable.taozi);
            fruits.add(taozi);

        }


    }

    private void initView() {
        mMrecyclerview = (RecyclerView) findViewById(R.id.mrecyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mMrecyclerview.setLayoutManager(manager);
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(fruits,this);
        mMrecyclerview.setAdapter(adapter);
    }
}
