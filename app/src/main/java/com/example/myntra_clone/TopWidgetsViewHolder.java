package com.example.myntra_clone;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class TopWidgetsViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvTopWidgets;
    public TopWidgetsViewHolder(@NonNull  View itemView) {
        super(itemView);
        mIvTopWidgets=itemView.findViewById(R.id.ivTopWidget);
    }

    void setData(TopWidgetsModel topWidgetsModel){
        mIvTopWidgets.setImageResource(topWidgetsModel.getImageId());

    }
}
