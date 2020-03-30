package com.example.demo.entity;

import java.io.Serializable;

public class UserItem implements Serializable {
    private String userid;

    private String name;

    private String roomid;

    private Boolean roomcard;

    private Boolean key;

    private Integer coupon1;

    private Integer coupon2;

    private Integer coupon3;

    private static final long serialVersionUID = 1L;

    public UserItem(String userid, String name, String roomid, Boolean roomcard, Boolean key, Integer coupon1, Integer coupon2, Integer coupon3) {
        this.userid = userid;
        this.name = name;
        this.roomid = roomid;
        this.roomcard = roomcard;
        this.key = key;
        this.coupon1 = coupon1;
        this.coupon2 = coupon2;
        this.coupon3 = coupon3;
    }

    public UserItem() {
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

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public Boolean getRoomcard() {
        return roomcard;
    }

    public void setRoomcard(Boolean roomcard) {
        this.roomcard = roomcard;
    }

    public Boolean getKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
    }

    public Integer getCoupon1() {
        return coupon1;
    }

    public void setCoupon1(Integer coupon1) {
        this.coupon1 = coupon1;
    }

    public Integer getCoupon2() {
        return coupon2;
    }

    public void setCoupon2(Integer coupon2) {
        this.coupon2 = coupon2;
    }

    public Integer getCoupon3() {
        return coupon3;
    }

    public void setCoupon3(Integer coupon3) {
        this.coupon3 = coupon3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", roomid=").append(roomid);
        sb.append(", roomcard=").append(roomcard);
        sb.append(", key=").append(key);
        sb.append(", coupon1=").append(coupon1);
        sb.append(", coupon2=").append(coupon2);
        sb.append(", coupon3=").append(coupon3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}