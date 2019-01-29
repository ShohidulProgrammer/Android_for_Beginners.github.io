package com.ithome.homeexercise.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ithome.homeexercise.R;

import pl.droidsonroids.gif.GifImageView;

public class WorkoutCardViewHolder extends RecyclerView.ViewHolder {

    private TextView workoutTitle;
    private TextView totalWorkout;
    private GifImageView workoutGifImg;
    private CardView workoutCardView;

    public WorkoutCardViewHolder(@NonNull View itemView) {
        super(itemView);

        workoutTitle= itemView.findViewById(R.id.workoutTitleId);
        totalWorkout = itemView.findViewById(R.id.totalWorkoutTextViewId);
        workoutGifImg = itemView.findViewById(R.id.workoutGifImageViewId);
        workoutCardView = itemView.findViewById(R.id.workoutCardViewId);

    }
}
