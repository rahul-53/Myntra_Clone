package com.example.myntra_clone;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopWidgetsModel  {

    public int imageId;

    public TopWidgetsModel(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }
}
