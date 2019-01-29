package com.ithome.homeexercise.model;

public class Training {

    private String title;
    private String imageUrl;

    public Training(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
