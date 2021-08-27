package com.example.myntra_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnNext;
    private Button mBtnExplore;
    private Button mBtnCategories;
    private NavigationView mBottomNavigationView;
    private ImageView mShoppingBag, mFavourites,mSearch,mNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation();
        initView();

    }


    private void initView(){
        mShoppingBag = findViewById(R.id.ivShoppingBag);
        mFavourites = findViewById(R.id.ivFavourites);
        mSearch = findViewById(R.id.ivSearch);
        mNotification = findViewById(R.id.ivNotification);

        mShoppingBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShoppingBag.class);
                startActivity(intent);
            }
        });

        mNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Notifications.class);
                startActivity(intent);
            }
        });


    }

    private void bottomNavigation() {
        //init and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home Selected
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        //perform itemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (bottomNavigationView.getSelectedItemId()) {
                    case R.id.nav_home:

                        return true;
                    case R.id.nav_categories:
                        startActivity(new Intent(getApplicationContext(), Categories.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_studio:
                        startActivity(new Intent(getApplicationContext(), Studio.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_explore:
                        startActivity(new Intent(getApplicationContext(), Explore.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }


    }
