package com.ithome.homeexercise.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;

import com.ithome.homeexercise.R;

import pl.droidsonroids.gif.GifImageView;

public class WorkoutPerformCardViewHolder extends RecyclerView.ViewHolder {

    protected CardView      workoutPerformCardView;
    protected GifImageView  workoutPerformGifImgView;
    protected ImageButton   videoUrlImgBtn;
    protected ImageButton   speekImgBtn;
    protected TextClock     workoutTimeLeft;
    protected ProgressBar   workoutPerformProgress;
    protected TextView      workoutCountTxtView;
    protected TextView      totalWorkoutTxtView;
    protected TextView      workoutTitle;
    protected TextView      dayCountTxtView;
    protected TextView      levelCountTxtView;

    public WorkoutPerformCardViewHolder(@NonNull View itemView) {
        super(itemView);

        workoutPerformCardView = itemView.findViewById(R.id.workoutPerformCardViewId);
        workoutPerformGifImgView = itemView.findViewById(R.id.workoutPerformGifImageViewId);
        videoUrlImgBtn = itemView.findViewById(R.id.videoUrlImageButtonId);
        speekImgBtn = itemView.findViewById(R.id.speekImageButtonId);
        workoutTimeLeft = itemView.findViewById(R.id.workTimeLeftTextClock);
        workoutPerformProgress = itemView.findViewById(R.id.workoutPerformProgressBarId);
        workoutCountTxtView  = itemView.findViewById(R.id.workoutCountTextViewId);
        totalWorkoutTxtView = itemView.findViewById(R.id.totalWorkoutTextViewId);
        workoutTitle = itemView.findViewById(R.id.workoutTitleId);
        dayCountTxtView = itemView.findViewById(R.id.dayCountTextViewId);
        levelCountTxtView = itemView.findViewById(R.id.levelCountTextViewId);

    }
}
