package com.ithome.homeexercisetest;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class ExerciseTypeCardViewHolder extends RecyclerView.ViewHolder {

    private TextView exerciseTypeTitle;
    private ImageView exerciseTypeImg;

    private TextView totalWorkoutDays;
    private TextView DaysWorkoutCompletPercent;
    private ProgressBar progressBarPercentCompleteDaysWorkout;
//    private TextView dayCount;

//    private TextView level;
    private CardView exerciseTypeCardView;


    public ExerciseTypeCardViewHolder(@NonNull View itemView) {
        super(itemView);

        exerciseTypeTitle = itemView.findViewById(R.id.exerciseTypeTitleTextViewId);
        exerciseTypeImg = itemView.findViewById(R.id.exerciseTypeImageViewId);

        // days complete
        totalWorkoutDays = itemView.findViewById(R.id.totalWorkoutDaysTextViewId);
//        dayCount = itemView.findViewById(R.id.exerciseTypeDayCountTextViewId);
        DaysWorkoutCompletPercent = itemView.findViewById(R.id.percentCompleteDaysWorkoutTextViewId);
        progressBarPercentCompleteDaysWorkout = itemView.findViewById(R.id.percentCompleteDaysWorkoutProgressBarId);

        // beginner, intermediate, advance level
//        level = itemView.findViewById(R.id.levelTextViewId);

        exerciseTypeCardView = itemView.findViewById(R.id.exerciseTypeCardViewId);
    }
}
