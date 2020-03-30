package com.example.demo.entity;

import java.io.Serializable;

public class OffRecord implements Serializable {
    private String userid;

    private String name;

    private String offtime;

    private String roomid;

    private static final long serialVersionUID = 1L;

    public OffRecord(String userid, String name, String offtime, String roomid) {
        this.userid = userid;
        this.name = name;
        this.offtime = offtime;
        this.roomid = roomid;
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

    public String getOfftime() {
        return offtime;
    }

    public void setOfftime(String offtime) {
        this.offtime = offtime == null ? null : offtime.trim();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", offtime=").append(offtime);
        sb.append(", roomid=").append(roomid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}