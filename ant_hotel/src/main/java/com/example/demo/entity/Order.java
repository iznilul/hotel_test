package com.example.demo.entity;

public class Order {
    private String foodid;
    private String foodname;
    private Integer number;

    @Override
    public String toString() {
        return "Order{" +
                "foodid='" + foodid + '\'' +
                ", foodname='" + foodname + '\'' +
                ", number=" + number +
                '}';
    }

    public String getFoodid() {
        return foodid;
    }

    public void setFoodid(String foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
