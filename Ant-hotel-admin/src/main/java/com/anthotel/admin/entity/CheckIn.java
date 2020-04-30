package com.anthotel.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class CheckIn implements Serializable {
    private String userid;

    private String name;

    private String roomid;

    private String phonenumber;

    private Date checkintime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public CheckIn(String userid, String name, String roomid, String phonenumber, Date checkintime, Date updatetime) {
        this.userid = userid;
        this.name = name;
        this.roomid = roomid;
        this.phonenumber = phonenumber;
        this.checkintime = checkintime;
        this.updatetime = updatetime;
    }

    public CheckIn() {
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

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
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
        sb.append(", checkintime=").append(checkintime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}