package com.example.myntra_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShoppingBag extends AppCompatActivity {

    private ImageView mBackIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_bag);
        mBackIcon = findViewById(R.id.ivBackArrow);
        mBackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingBag.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}