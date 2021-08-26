package com.example.myntra_clone;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CategoriesViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;

    public CategoriesViewHolder(@NonNull View itemView) {
        super(itemView);
        mIvImage = itemView.findViewById(R.id.ivImage);

    }

public void setData(CategoriesModel categoriesModel){
    mIvImage.setImageResource(categoriesModel.getImageId());
}

}
