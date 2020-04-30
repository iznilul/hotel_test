package com.anthotel.admin.entity;

import java.io.Serializable;

public class RoomInfo implements Serializable {
    private String roomid;

    private String roomstatus;

    private static final long serialVersionUID = 1L;

    public RoomInfo(String roomid, String roomstatus) {
        this.roomid = roomid;
        this.roomstatus = roomstatus;
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

    public String getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(String roomstatus) {
        this.roomstatus = roomstatus == null ? null : roomstatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomid=").append(roomid);
        sb.append(", roomstatus=").append(roomstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}