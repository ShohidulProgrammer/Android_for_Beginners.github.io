package com.ithome.homeexercise.model;

public class Workout {
    private String Title;
    private int totalWorkout;
    private String gifImageUrl;
//    private String CardView;


    public Workout(String title, int totalWorkout, String gifImageUrl) {
        Title = title;
        this.totalWorkout = totalWorkout;
        this.gifImageUrl = gifImageUrl;
    }

    public String getTitle() {
        return Title;
    }

    public int getTotalWorkout() {
        return totalWorkout;
    }

    public String getGifImageUrl() {
        return gifImageUrl;
    }
}
