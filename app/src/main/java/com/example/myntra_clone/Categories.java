package com.example.myntra_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Categories extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<CategoriesModel> categoriesModelArrayList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        mRecyclerView = findViewById(R.id.recyclerView);

        buildCategoryList();
        setRecyclerView();


    }

    private void buildCategoryList(){


        CategoriesModel categoriesModel=new CategoriesModel(R.drawable.c_autumn_winter_11zon);
        categoriesModelArrayList.add(categoriesModel);
        CategoriesModel categoriesModel1=new CategoriesModel(R.drawable.c_women_11zon);
        categoriesModelArrayList.add(categoriesModel1);
        CategoriesModel categoriesModel2=new CategoriesModel(R.drawable.c_men_11zon);
        categoriesModelArrayList.add(categoriesModel2);
        CategoriesModel categoriesModel3=new CategoriesModel(R.drawable.c_kids_11zon);
        categoriesModelArrayList.add(categoriesModel3);
        CategoriesModel categoriesModel4=new CategoriesModel(R.drawable.c_beauty_and_personal_care_11zon);
        categoriesModelArrayList.add(categoriesModel4);
        CategoriesModel categoriesModel5=new CategoriesModel(R.drawable.c_home_and_iving_11zon);
        categoriesModelArrayList.add(categoriesModel5);
        CategoriesModel categoriesModel6=new CategoriesModel(R.drawable.c_gadgets_11zon);
        categoriesModelArrayList.add(categoriesModel6);
        CategoriesModel categoriesModel7=new CategoriesModel(R.drawable.c_plus_size_11zon);
        categoriesModelArrayList.add(categoriesModel7);
        CategoriesModel categoriesModel8=new CategoriesModel(R.drawable.c_theme_store_11zon);
        categoriesModelArrayList.add(categoriesModel8);
        CategoriesModel categoriesModel9=new CategoriesModel(R.drawable.c_myntra_luxe_11zon);
        categoriesModelArrayList.add(categoriesModel9);
        CategoriesModel categoriesModel10=new CategoriesModel(R.drawable.c_myntra_mall_11zon);
        categoriesModelArrayList.add(categoriesModel10);

    }

    private void setRecyclerView(){
        CategoriesAdapter adapter = new CategoriesAdapter(categoriesModelArrayList);

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(adapter);

    }



}