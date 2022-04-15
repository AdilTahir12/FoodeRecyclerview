package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.burger,"Burger"));
        userList.add(new ModelClass(R.drawable.sandwich,"Sandwich"));
        userList.add(new ModelClass(R.drawable.shawarma,"Shawarma"));
        userList.add(new ModelClass(R.drawable.piza,"Piza"));
        userList.add(new ModelClass(R.drawable.nuggets,"Nuggets"));
        userList.add(new ModelClass(R.drawable.fries,"HotFries"));
        userList.add(new ModelClass(R.drawable.hotdrinks,"HotDrinks"));
        userList.add(new ModelClass(R.drawable.drinks,"ColdDrinks"));
        userList.add(new ModelClass(R.drawable.icecream,"IceCream"));
        userList.add(new ModelClass(R.drawable.candiments,"Candiments"));








    }


}