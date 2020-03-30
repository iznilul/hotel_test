package com.example.demo.entity;

import java.io.Serializable;

public class CheckIn implements Serializable {
    private String userid;

    private String reserveid;

    private String name;

    private String roomnumber;

    private String roomtype;

    private String checkintime;

    private String updatetime;

    private static final long serialVersionUID = 1L;

    public CheckIn(String userid, String reserveid, String name, String roomnumber, String roomtype, String checkintime, String updatetime) {
        this.userid = userid;
        this.reserveid = reserveid;
        this.name = name;
        this.roomnumber = roomnumber;
        this.roomtype = roomtype;
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

    public String getReserveid() {
        return reserveid;
    }

    public void setReserveid(String reserveid) {
        this.reserveid = reserveid == null ? null : reserveid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber == null ? null : roomnumber.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime == null ? null : checkintime.trim();
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
        sb.append(", reserveid=").append(reserveid);
        sb.append(", name=").append(name);
        sb.append(", roomnumber=").append(roomnumber);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}