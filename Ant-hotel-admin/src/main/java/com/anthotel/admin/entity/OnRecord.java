package com.anthotel.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class OnRecord implements Serializable {
    private String userid;

    private String name;

    private String roomid;

    private Date ontime;

    private static final long serialVersionUID = 1L;

    public OnRecord(String userid, String name, String roomid, Date ontime) {
        this.userid = userid;
        this.name = name;
        this.roomid = roomid;
        this.ontime = ontime;
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

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public Date getOntime() {
        return ontime;
    }

    public void setOntime(Date ontime) {
        this.ontime = ontime;
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
        sb.append(", ontime=").append(ontime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}