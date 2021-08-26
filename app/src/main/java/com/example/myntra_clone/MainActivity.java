package com.example.myntra_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnNext;
    private Button mBtnExplore;
    private Button mBtnCategories;
    private NavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnNext = findViewById(R.id.btnNext);
        mBtnExplore = findViewById(R.id.btnExplore);
        mBtnCategories = findViewById(R.id.btnCategories);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });

        mBtnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Explore.class);
                startActivity(intent1);
            }
        });
        mBtnCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Categories.class);
                startActivity(intent1);
            }
        });


    }

    private void BottomNavigation() {

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (bottomNavigationView.getSelectedItemId()){
                   case R.id.nav_categories:
                    startActivity(new Intent(getApplicationContext(),CategoriesFragment.class));
                    overridePendingTransition(0,0);
                    return true;
               }
               return false;
            }
        });
    }


}