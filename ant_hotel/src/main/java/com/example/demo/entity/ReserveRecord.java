package com.example.demo.entity;

import java.io.Serializable;

public class ReserveRecord implements Serializable {
    private Integer reserveid;

    private String name;

    private String phonenumber;

    private String roomtype;

    private String reservetime;

    private static final long serialVersionUID = 1L;

    public ReserveRecord(Integer reserveid, String name, String phonenumber, String roomtype, String reservetime) {
        this.reserveid = reserveid;
        this.name = name;
        this.phonenumber = phonenumber;
        this.roomtype = roomtype;
        this.reservetime = reservetime;
    }

    public ReserveRecord() {
        super();
    }

    public Integer getReserveid() {
        return reserveid;
    }

    public void setReserveid(Integer reserveid) {
        this.reserveid = reserveid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getReservetime() {
        return reservetime;
    }

    public void setReservetime(String reservetime) {
        this.reservetime = reservetime == null ? null : reservetime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reserveid=").append(reserveid);
        sb.append(", name=").append(name);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", reservetime=").append(reservetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}