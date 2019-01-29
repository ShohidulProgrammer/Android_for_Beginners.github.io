package com.ithome.homeexercise;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TrainingTypeCardViewHolder extends RecyclerView.ViewHolder {

    CardView traingTypeCardView;
    TextView title;
    ImageView trainingTypeImage;

    public TrainingTypeCardViewHolder(@NonNull View itemView) {
        super(itemView);

        traingTypeCardView = itemView.findViewById(R.id.trainingTypeCArdViewId);
        title = itemView.findViewById(R.id.trainingTypeTitlTextViewId);
        trainingTypeImage = itemView.findViewById(R.id.trainingTypeImageViewId);
    }
}
