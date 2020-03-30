package com.example.demo.service;

import com.example.demo.entity.Coupons;

import java.util.List;

public interface CouponService {
    int deleteByPrimaryKey(String couponid);

    int insert(Coupons record);

    Coupons selectByPrimaryKey(String couponid);

    List<Coupons> selectAll();

    int updateByPrimaryKey(Coupons record);
}
