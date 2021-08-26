package com.example.myntra_clone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopWidgetsAdapter extends RecyclerView.Adapter<TopWidgetsViewHolder> {

    ArrayList<TopWidgetsModel>topWidgetsModelArrayList;

    public TopWidgetsAdapter(ArrayList<TopWidgetsModel>topWidgetsModelArrayList){
        this.topWidgetsModelArrayList=topWidgetsModelArrayList;
    }

    @NonNull

    @Override
    public TopWidgetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_widget_layout,parent,false);
        return new TopWidgetsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopWidgetsViewHolder holder, int position) {
        TopWidgetsModel topWidgetsModel = topWidgetsModelArrayList.get(position);
        holder.setData(topWidgetsModel);


    }

    @Override
    public int getItemCount() {
        return topWidgetsModelArrayList.size();
    }
}
