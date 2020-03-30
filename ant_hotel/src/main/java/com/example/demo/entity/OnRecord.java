package com.example.demo.entity;

import java.io.Serializable;

public class OnRecord implements Serializable {
    private String userid;

    private String name;

    private String ontime;

    private String roomid;

    private static final long serialVersionUID = 1L;

    public OnRecord(String userid, String name, String ontime, String roomid) {
        this.userid = userid;
        this.name = name;
        this.ontime = ontime;
        this.roomid = roomid;
    }

    public OnRecord() {
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

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime == null ? null : ontime.trim();
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
        sb.append(", ontime=").append(ontime);
        sb.append(", roomid=").append(roomid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}