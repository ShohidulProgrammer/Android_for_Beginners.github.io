package com.ithome.homeexercise.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ithome.homeexercise.R;

import pl.droidsonroids.gif.GifImageView;

public class ExerciseTypeCardViewHolder extends RecyclerView.ViewHolder {

    private TextView exerciseTypeTitle;
    private TextView dayCount;
    private TextView totalDaysWorkout;
    private TextView countPercentCompleteDaysWorkout;
    private TextView level;
    private ImageView exerciseTypeImg;
    private ProgressBar progressBarPercentCompleteDaysWorkout;
    private CardView exerciseTypeCardView;


    public ExerciseTypeCardViewHolder(@NonNull View itemView) {
        super(itemView);

        exerciseTypeTitle = itemView.findViewById(R.id.workoutTitleId);
        dayCount = itemView.findViewById(R.id.exerciseTypeDayCountTextViewId);
        totalDaysWorkout= itemView.findViewById(R.id.totalWorkoutTextViewId);
        countPercentCompleteDaysWorkout = itemView.findViewById(R.id.percentCompleteDaysWorkoutTextViewId);
        level = itemView.findViewById(R.id.levelTextViewId);
        exerciseTypeImg = itemView.findViewById(R.id.exerciseTypeImageViewId);
        progressBarPercentCompleteDaysWorkout = itemView.findViewById(R.id.percentCompleteDaysWorkoutProgressBarId);
        exerciseTypeCardView = itemView.findViewById(R.id.exerciseTypeCArdViewId);
    }
}
