package com.anthotel.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class OffRecord implements Serializable {
    private String userid;

    private String name;

    private String roomid;

    private Date offtime;

    private static final long serialVersionUID = 1L;

    public OffRecord(String userid, String name, String roomid, Date offtime) {
        this.userid = userid;
        this.name = name;
        this.roomid = roomid;
        this.offtime = offtime;
    }

    public OffRecord() {
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

    public Date getOfftime() {
        return offtime;
    }

    public void setOfftime(Date offtime) {
        this.offtime = offtime;
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
        sb.append(", offtime=").append(offtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}