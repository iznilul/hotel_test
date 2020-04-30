package com.anthotel.admin.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CheckOut implements Serializable {
    private String userid;

    private String name;

    private String roomid;

    private String phonenumber;

    private BigDecimal cost;

    private Date checkouttime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public CheckOut(String userid, String name, String roomid, String phonenumber, BigDecimal cost, Date checkouttime, Date updatetime) {
        this.userid = userid;
        this.name = name;
        this.roomid = roomid;
        this.phonenumber = phonenumber;
        this.cost = cost;
        this.checkouttime = checkouttime;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(Date checkouttime) {
        this.checkouttime = checkouttime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", cost=").append(cost);
        sb.append(", checkouttime=").append(checkouttime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}