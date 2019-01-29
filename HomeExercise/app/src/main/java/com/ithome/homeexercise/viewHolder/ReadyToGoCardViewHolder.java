package com.ithome.homeexercise.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ithome.homeexercise.R;

public class ReadyToGoCardViewHolder extends RecyclerView.ViewHolder {

    CardView    workoutReadyToGoCard;
    TextView    readyToGoTxt;
    TextView    timeIncrement;
    TextView    skip;
    ProgressBar progressCircle;

    public ReadyToGoCardViewHolder(@NonNull View itemView) {
        super(itemView);

        workoutReadyToGoCard = itemView.findViewById(R.id.workoutReadyToGoCardViewId);
        readyToGoTxt = itemView.findViewById(R.id.readyToGoTextViewId);
        timeIncrement = itemView.findViewById(R.id.timeIncrementTextViewId);
        skip = itemView.findViewById(R.id.skipTextViewId);
        progressCircle = itemView.findViewById(R.id.readyToGoProgressBarCircleId);
    }
}
