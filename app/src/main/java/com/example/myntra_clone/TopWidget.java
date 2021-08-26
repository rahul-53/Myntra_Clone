package com.example.myntra_clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TopWidget extends AppCompatActivity {
    private RecyclerView mWidgetsRecyclerView;
    ArrayList<TopWidgetsModel> widgetsModelList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_widget);
        mWidgetsRecyclerView=findViewById(R.id.widgetRecyclerView);
        buildDataList();
        setRecyclerView();
    }

    private void buildDataList(){
        TopWidgetsModel topWidgetsModel =new TopWidgetsModel(R.drawable.hot_deals_11zon);
        widgetsModelList.add(topWidgetsModel);

    }

    private void setRecyclerView(){
        TopWidgetsAdapter adapter = new TopWidgetsAdapter(widgetsModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        mWidgetsRecyclerView.setLayoutManager(linearLayoutManager);
        mWidgetsRecyclerView.setAdapter(adapter);
    }


}