package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.CouponsMapper;
import com.anthotel.admin.entity.Coupons;
import com.anthotel.admin.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    CouponsMapper couponsMapper;
    @Override
    public int deleteByPrimaryKey(String couponid) {
        return couponsMapper.deleteByPrimaryKey(couponid);
    }

    public int insert(Coupons record) {
        return couponsMapper.insert(record);
    }

    public Coupons selectByPrimaryKey(String couponid) {
        return couponsMapper.selectByPrimaryKey(couponid);
    }

    public List<Coupons> selectAll() {
        return couponsMapper.selectAll();
    }

    public int updateByPrimaryKey(Coupons record) {
        return couponsMapper.updateByPrimaryKey(record);
    }
}
