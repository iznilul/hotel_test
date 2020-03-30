package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CheckOut implements Serializable {
    private String userid;

    private String name;

    private String roomid;

    private String roomtype;

    private String checkouttime;

    private BigDecimal cost;

    private String updatetime;

    private static final long serialVersionUID = 1L;

    public CheckOut(String userid, String name, String roomid, String roomtype, String checkouttime, BigDecimal cost, String updatetime) {
        this.userid = userid;
        this.name = name;
        this.roomid = roomid;
        this.roomtype = roomtype;
        this.checkouttime = checkouttime;
        this.cost = cost;
        this.updatetime = updatetime;
    }

    public CheckOut() {
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

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime == null ? null : checkouttime.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
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
        sb.append(", roomtype=").append(roomtype);
        sb.append(", checkouttime=").append(checkouttime);
        sb.append(", cost=").append(cost);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}