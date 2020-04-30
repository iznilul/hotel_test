package com.anthotel.admin.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class HotelList implements Serializable {
    private String hotelid;

    private String hotelname;

    private String address;

    private String service;

    private BigDecimal basecost;

    private Float score;

    private static final long serialVersionUID = 1L;

    public HotelList(String hotelid, String hotelname, String address, String service, BigDecimal basecost, Float score) {
        this.hotelid = hotelid;
        this.hotelname = hotelname;
        this.address = address;
        this.service = service;
        this.basecost = basecost;
        this.score = score;
    }

    public HotelList() {
        super();
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid == null ? null : hotelid.trim();
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public BigDecimal getBasecost() {
        return basecost;
    }

    public void setBasecost(BigDecimal basecost) {
        this.basecost = basecost;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hotelid=").append(hotelid);
        sb.append(", hotelname=").append(hotelname);
        sb.append(", address=").append(address);
        sb.append(", service=").append(service);
        sb.append(", basecost=").append(basecost);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}