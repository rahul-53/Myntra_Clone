package com.example.myntra_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {
    private Button mBtnLoginSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        bottomNavigation();
        mBtnLoginSignUp = findViewById(R.id.btnLoginSignUp);
        mBtnLoginSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Login.class);
                startActivity(intent);
            }
        });
    }



    private void bottomNavigation() {
        //init and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home Selected
        bottomNavigationView.setSelectedItemId(R.id.nav_profile);

        //perform itemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (bottomNavigationView.getSelectedItemId()) {
                    case R.id.nav_profile:

                        return true;
                    case R.id.nav_categories:
                        startActivity(new Intent(getApplicationContext(), Categories.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_explore:
                        startActivity(new Intent(getApplicationContext(), Explore.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_studio:
                        startActivity(new Intent(getApplicationContext(), Studio.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }

}