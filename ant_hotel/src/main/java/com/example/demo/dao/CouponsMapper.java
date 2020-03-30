package com.example.demo.dao;

import com.example.demo.entity.Coupons;
import java.util.List;

public interface CouponsMapper {
    int deleteByPrimaryKey(String couponid);

    int insert(Coupons record);

    Coupons selectByPrimaryKey(String couponid);

    List<Coupons> selectAll();

    int updateByPrimaryKey(Coupons record);
}