package com.anthotel.admin.entity;

import java.io.Serializable;

public class Menu implements Serializable {
    private String foodid;

    private String foodname;

    private Integer price;

    private static final long serialVersionUID = 1L;

    public Menu(String foodid, String foodname, Integer price) {
        this.foodid = foodid;
        this.foodname = foodname;
        this.price = price;
    }

    public Menu() {
        super();
    }

    public String getFoodid() {
        return foodid;
    }

    public void setFoodid(String foodid) {
        this.foodid = foodid == null ? null : foodid.trim();
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foodid=").append(foodid);
        sb.append(", foodname=").append(foodname);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}