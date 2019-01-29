package com.ithome.homeexercise.model;

import android.support.v7.widget.RecyclerView;

public class WorkoutPerform {

//   private String workoutPerformCardView;

   private String workoutPerformGifImgUrl;
   private String videoUrl;
   private String speekUrl;
   private String workoutTitle;

   private float workoutPerformProgress;

   private int workoutTimeLeft;
   private int workoutCount;
   private int totalWorkout;
   private int dayCount;
   private int levelCount;

    public WorkoutPerform(String workoutPerformGifImgUrl, String videoUrl, String speekUrl, String workoutTitle, float workoutPerformProgress, int workoutTimeLeft, int workoutCount, int totalWorkout, int dayCount, int levelCount) {
        this.workoutPerformGifImgUrl = workoutPerformGifImgUrl;
        this.videoUrl = videoUrl;
        this.speekUrl = speekUrl;
        this.workoutTitle = workoutTitle;
        this.workoutPerformProgress = workoutPerformProgress;
        this.workoutTimeLeft = workoutTimeLeft;
        this.workoutCount = workoutCount;
        this.totalWorkout = totalWorkout;
        this.dayCount = dayCount;
        this.levelCount = levelCount;
    }


    public String getWorkoutPerformGifImgUrl() {
        return workoutPerformGifImgUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getSpeekUrl() {
        return speekUrl;
    }

    public String getWorkoutTitle() {
        return workoutTitle;
    }

    public float getWorkoutPerformProgress() {
        return workoutPerformProgress;
    }

    public int getWorkoutTimeLeft() {
        return workoutTimeLeft;
    }

    public int getWorkoutCount() {
        return workoutCount;
    }

    public int getTotalWorkout() {
        return totalWorkout;
    }

    public int getDayCount() {
        return dayCount;
    }

    public int getLevelCount() {
        return levelCount;
    }
}
