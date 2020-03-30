package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class RoomInfo implements Serializable {
    private String roomid;

    private String roomtype;

    private String roomstatus;

    private BigDecimal roomprice;

    private BigDecimal hourprice;

    private static final long serialVersionUID = 1L;

    public RoomInfo(String roomid, String roomtype, String roomstatus, BigDecimal roomprice, BigDecimal hourprice) {
        this.roomid = roomid;
        this.roomtype = roomtype;
        this.roomstatus = roomstatus;
        this.roomprice = roomprice;
        this.hourprice = hourprice;
    }

    public RoomInfo() {
        super();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(String roomstatus) {
        this.roomstatus = roomstatus == null ? null : roomstatus.trim();
    }

    public BigDecimal getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(BigDecimal roomprice) {
        this.roomprice = roomprice;
    }

    public BigDecimal getHourprice() {
        return hourprice;
    }

    public void setHourprice(BigDecimal hourprice) {
        this.hourprice = hourprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomid=").append(roomid);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", roomstatus=").append(roomstatus);
        sb.append(", roomprice=").append(roomprice);
        sb.append(", hourprice=").append(hourprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}