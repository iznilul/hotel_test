package com.anthotel.admin.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class HotelRoomInfo implements Serializable {
    private Integer id;

    private String hotelid;

    private String roomtype;

    private String roomservice;

    private String roomcount;

    private BigDecimal roomprice;

    private BigDecimal hourprice;

    private static final long serialVersionUID = 1L;

    public HotelRoomInfo(Integer id, String hotelid, String roomtype, String roomservice, String roomcount, BigDecimal roomprice, BigDecimal hourprice) {
        this.id = id;
        this.hotelid = hotelid;
        this.roomtype = roomtype;
        this.roomservice = roomservice;
        this.roomcount = roomcount;
        this.roomprice = roomprice;
        this.hourprice = hourprice;
    }

    public HotelRoomInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid == null ? null : hotelid.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getRoomservice() {
        return roomservice;
    }

    public void setRoomservice(String roomservice) {
        this.roomservice = roomservice == null ? null : roomservice.trim();
    }

    public String getRoomcount() {
        return roomcount;
    }

    public void setRoomcount(String roomcount) {
        this.roomcount = roomcount == null ? null : roomcount.trim();
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
        sb.append(", id=").append(id);
        sb.append(", hotelid=").append(hotelid);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", roomservice=").append(roomservice);
        sb.append(", roomcount=").append(roomcount);
        sb.append(", roomprice=").append(roomprice);
        sb.append(", hourprice=").append(hourprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}