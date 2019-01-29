package com.ithome.homeexercise.model;

//public class DayCardView implements BaseModel {
//    @Override
//    public int getViewType() {
//        return 1;
//    }
//}

public class DayCardView{

    private String Title;
    private int dayCount;
    private float exercisePercentComplete;
//    private float progressCircle;
    private String gifImageUrl;
//    private String CardView;


    public DayCardView(String title, int dayCount, float exercisePercentComplete, String gifImageUrl) {
        Title = title;
        this.dayCount = dayCount;
        this.exercisePercentComplete = exercisePercentComplete;
        this.gifImageUrl = gifImageUrl;
    }

    public String getTitle() {
        return Title;
    }

    public int getDayCount() {
        return dayCount;
    }

    public float getExercisePercentComplete() {
        return exercisePercentComplete;
    }

    public String getGifImageUrl() {
        return gifImageUrl;
    }
}
