package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class RoomLiveRecord implements Serializable {
    private String userid;

    private String name;

    private String signtime;

    private String leavetime;

    private String roomid;

    private BigDecimal cost;

    private static final long serialVersionUID = 1L;

    public RoomLiveRecord(String userid, String name, String signtime, String leavetime, String roomid, BigDecimal cost) {
        this.userid = userid;
        this.name = name;
        this.signtime = signtime;
        this.leavetime = leavetime;
        this.roomid = roomid;
        this.cost = cost;
    }

    public RoomLiveRecord() {
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

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime == null ? null : signtime.trim();
    }

    public String getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(String leavetime) {
        this.leavetime = leavetime == null ? null : leavetime.trim();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", signtime=").append(signtime);
        sb.append(", leavetime=").append(leavetime);
        sb.append(", roomid=").append(roomid);
        sb.append(", cost=").append(cost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}