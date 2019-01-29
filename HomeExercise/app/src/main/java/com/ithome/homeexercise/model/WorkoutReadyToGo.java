package com.ithome.homeexercise.model;

public class WorkoutReadyToGo {

//   private String workoutReadyToGoCard;
   private String readyToGoTxt;
   private int    timeIncrement;
   private String skip;
   private float  progressCircle;

    public WorkoutReadyToGo(String readyToGoTxt, int timeIncrement, String skip, float progressCircle) {
        this.readyToGoTxt = readyToGoTxt;
        this.timeIncrement = timeIncrement;
        this.skip = skip;
        this.progressCircle = progressCircle;
    }

    public String getReadyToGoTxt() {
        return readyToGoTxt;
    }

    public int getTimeIncrement() {
        return timeIncrement;
    }

    public String getSkip() {
        return skip;
    }

    public float getProgressCircle() {
        return progressCircle;
    }
}
