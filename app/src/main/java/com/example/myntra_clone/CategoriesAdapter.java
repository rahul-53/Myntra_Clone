package com.example.myntra_clone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesViewHolder> {

    ArrayList<CategoriesModel> categoriesModels ;

    public CategoriesAdapter(ArrayList<CategoriesModel> categoriesModels){
        this.categoriesModels=categoriesModels;
    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_layout,parent,false);
        return new CategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesViewHolder holder, int position) {

        CategoriesModel categoriesModel =categoriesModels.get(position);
        holder.setData(categoriesModel);

    }


    @Override
    public int getItemCount() {
        return categoriesModels.size();
    }
}
