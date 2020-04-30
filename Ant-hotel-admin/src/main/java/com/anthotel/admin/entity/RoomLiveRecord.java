package com.anthotel.admin.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RoomLiveRecord implements Serializable {
    private String userid;

    private String name;

    private Date signtime;

    private Date leavetime;

    private String roomid;

    private BigDecimal cost;

    private static final long serialVersionUID = 1L;

    public RoomLiveRecord(String userid, String name, Date signtime, Date leavetime, String roomid, BigDecimal cost) {
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

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
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