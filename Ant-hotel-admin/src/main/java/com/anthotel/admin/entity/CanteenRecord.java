package com.anthotel.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class CanteenRecord implements Serializable {
    private String userid;

    private String name;

    private Integer totalprice;

    private Integer coupon;

    private Integer cost;

    private Date ontime;

    private String food;

    private static final long serialVersionUID = 1L;

    public CanteenRecord(String userid, String name, Integer totalprice, Integer coupon, Integer cost, Date ontime, String food) {
        this.userid = userid;
        this.name = name;
        this.totalprice = totalprice;
        this.coupon = coupon;
        this.cost = cost;
        this.ontime = ontime;
        this.food = food;
    }

    public CanteenRecord() {
        super();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getCoupon() {
        return coupon;
    }

    public void setCoupon(Integer coupon) {
        this.coupon = coupon;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getOntime() {
        return ontime;
    }

    public void setOntime(Date ontime) {
        this.ontime = ontime;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", coupon=").append(coupon);
        sb.append(", cost=").append(cost);
        sb.append(", ontime=").append(ontime);
        sb.append(", food=").append(food);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}