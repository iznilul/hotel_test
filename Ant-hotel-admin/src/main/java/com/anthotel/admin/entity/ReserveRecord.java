package com.anthotel.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class ReserveRecord implements Serializable {
    private String orderid;

    private String hotelid;

    private String openid;

    private String uname;

    private String phonenumber;

    private String roomtype;

    private Date reservetime;

    private Float prefee;

    private Byte status;

    private Date starttime;

    private Date endtime;

    private static final long serialVersionUID = 1L;

    public ReserveRecord(String orderid, String hotelid, String openid, String uname, String phonenumber, String roomtype, Date reservetime, Float prefee, Byte status, Date starttime, Date endtime) {
        this.orderid = orderid;
        this.hotelid = hotelid;
        this.openid = openid;
        this.uname = uname;
        this.phonenumber = phonenumber;
        this.roomtype = roomtype;
        this.reservetime = reservetime;
        this.prefee = prefee;
        this.status = status;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public ReserveRecord() {
        super();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid == null ? null : hotelid.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
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

    public Date getReservetime() {
        return reservetime;
    }

    public void setReservetime(Date reservetime) {
        this.reservetime = reservetime;
    }

    public Float getPrefee() {
        return prefee;
    }

    public void setPrefee(Float prefee) {
        this.prefee = prefee;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", hotelid=").append(hotelid);
        sb.append(", openid=").append(openid);
        sb.append(", uname=").append(uname);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", reservetime=").append(reservetime);
        sb.append(", prefee=").append(prefee);
        sb.append(", status=").append(status);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}