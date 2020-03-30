package com.example.demo.controller;

import com.example.demo.entity.Coupons;
import com.example.demo.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Coupon")
public class CouponController {
    @Autowired
    CouponService couponService;
//    关于餐券的增删改减
    @RequestMapping("/insert")
    public int insert(String couponid, String coupontype,int couponrate) {
        Coupons coupons = new Coupons(couponid, coupontype, couponrate);
        return couponService.insert(coupons);
    }

    @RequestMapping("/show")
    public List<Coupons> show() {
        return couponService.selectAll();
    }

    @RequestMapping("/update")
    public int update(String couponid,String coupontype,Integer couponrate) {
        Coupons coupons = new Coupons(couponid, coupontype, couponrate);
        return couponService.updateByPrimaryKey(coupons);
    }

    @RequestMapping("/delete")
    public int delete(String couponid){
        return couponService.deleteByPrimaryKey(couponid);
    }

    @RequestMapping("/select")
    public Coupons select(String couponid) {
        return couponService.selectByPrimaryKey(couponid);
    }
}
