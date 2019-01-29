package com.ithome.myrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class MyViewHolder extends RecyclerView.ViewHolder {

//    protected ImageView imageView;
    protected GifImageView imageView;
    protected CardView cardView;
    protected TextView headText;
    protected TextView descriptionText;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        cardView = itemView.findViewById(R.id.listCardViewId);

        imageView = itemView.findViewById(R.id.imageListImageViewId);
        headText = itemView.findViewById(R.id.headLIneListTextViewId);
        descriptionText = itemView.findViewById(R.id.descriptionTextViewId);

    }
}
