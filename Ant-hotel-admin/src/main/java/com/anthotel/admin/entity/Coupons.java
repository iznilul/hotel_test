package com.anthotel.admin.entity;

import java.io.Serializable;

public class Coupons implements Serializable {
    private String couponid;

    private String coupontype;

    private Integer couponrate;

    private static final long serialVersionUID = 1L;

    public Coupons(String couponid, String coupontype, Integer couponrate) {
        this.couponid = couponid;
        this.coupontype = coupontype;
        this.couponrate = couponrate;
    }

    public Coupons() {
        super();
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid == null ? null : couponid.trim();
    }

    public String getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype == null ? null : coupontype.trim();
    }

    public Integer getCouponrate() {
        return couponrate;
    }

    public void setCouponrate(Integer couponrate) {
        this.couponrate = couponrate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponid=").append(couponid);
        sb.append(", coupontype=").append(coupontype);
        sb.append(", couponrate=").append(couponrate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}