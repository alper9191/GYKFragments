package com.abeyler.gykfragments;

public class Food {

    private int resourceId;
    private String foodName;


    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    // default constructor
    public Food(){


    }

    public Food(int resourceId,String foodName){

        this.resourceId = resourceId;
        this.foodName = foodName;
    }


}
