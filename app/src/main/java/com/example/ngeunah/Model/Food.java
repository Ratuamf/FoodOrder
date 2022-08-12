package com.example.ngeunah.Model;

public class Food {
    final private int NO_IMAGE = -1;
    private String foodName;
    public void setType(String type) {
        this.type = type;
    }
    private String type;
    private int mImageResouce = NO_IMAGE;
    private int foodPrice;

    public Food(String foodName, int mImageResouce, int foodPrice, String type){
        this.foodName = foodName;
        this.mImageResouce = mImageResouce;
        this.foodPrice = foodPrice;
        this.type = type;
    }

    public String getFoodName(){
        return foodName;    }
    public String getType() {
        return type;     }
    public int getmImageResouce(){
        return mImageResouce;    }
    public int getFoodPrice(){
        return foodPrice;    }
}

