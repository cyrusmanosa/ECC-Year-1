package com.example.m230118;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m230118.Adapter.CategoryAdaptor;
import com.example.m230118.Adapter.PopularAdaptor;
import com.example.m230118.Domain.CategoryDomain;
import com.example.m230118.Domain.FoodDomain;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCategory();
        recyclerViewPopularList();
        bottomNavigation();
    }

    private void bottomNavigation(){
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        LinearLayout homBtn = findViewById(R.id.homeBtn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v) {
                startActivity(new Intent(MainActivity.this, CartListActivity.class));
            }
        });
        homBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
    }


    private void recyclerViewCategory(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza","cat_1"));
        category.add(new CategoryDomain("Burger","cat_2"));
        category.add(new CategoryDomain("HotDog","cat_3"));
        category.add(new CategoryDomain("Drink","cat_4"));
        category.add(new CategoryDomain("Donut","cat_5"));

        adapter = new CategoryAdaptor(category);

        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopularList(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( this ,LinearLayoutManager.HORIZONTAL , false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain( "Pepperoni Pizza" , "pizza1" , "Slices Pepperoni , Mozzerella Cheese , Fresh Oregano , Ground Black Pepper , Pizza Sauce" , 9.76));
        foodList.add(new FoodDomain( "Cheese Burger" , "burger" , "Beef , Gouda Cheese , Special Sauce , Lettuce , Tomato" , 8.79));
        foodList.add(new FoodDomain( "Vegetable Pizza" , "pizza2" , "Olive oil , Vegetable Oil , Pitted Kalamata , Cherry Tomatoes , Fresh Oregano , Basil" , 8.5));

        adapter2 = new PopularAdaptor(foodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }
}