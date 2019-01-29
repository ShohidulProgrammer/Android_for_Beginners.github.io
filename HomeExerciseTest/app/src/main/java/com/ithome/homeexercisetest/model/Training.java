package com.ithome.homeexercisetest.model;


public class Training extends BaseModel {

    private String title;
    private String imageUrl;

    public static final Training INSTANCE = new Training();

    public Training(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public Training() {

    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String table() {
//        return "training";
        return "myData";
    }
}
