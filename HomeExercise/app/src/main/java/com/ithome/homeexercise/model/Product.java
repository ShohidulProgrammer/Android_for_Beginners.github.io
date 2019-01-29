package com.ithome.homeexercise.model;

import com.ithome.homeexercise.model.BaseModel;

public class Product implements BaseModel {
    private int id;
    private String title;
    private String productGroupId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    @Override
    public int getViewType() {
        return  10; //Constants.ViewType.PRODUCT;
    }
}