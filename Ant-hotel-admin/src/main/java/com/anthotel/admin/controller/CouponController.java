package com.anthotel.admin.controller;

import com.anthotel.admin.entity.Coupons;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CouponController {
    @Autowired
    CouponService couponService;
//    关于餐券的增删改减
    @RequestMapping("/op/coupon/insert")
    public AjaxResult insert(String couponid, String coupontype, int couponrate) {
        Coupons coupons = new Coupons(couponid, coupontype, couponrate);
        int result = couponService.insert(coupons);
        if (result == 1) {
            return ResponseTool.success(coupons);
        } else {
            return ResponseTool.failed("添加餐券失败");
        }
    }

    @RequestMapping("/op/coupon/show")
    public AjaxResult show() {
        List<Coupons> list = couponService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有餐券");
        }
    }

    @RequestMapping("/op/coupon/update")
    public AjaxResult update(String couponid,String coupontype,Integer couponrate) {
        Coupons coupons = new Coupons(couponid, coupontype, couponrate);
        int result = couponService.updateByPrimaryKey(coupons);
        if (result == 1) {
            return ResponseTool.success(coupons);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping("/op/coupon/delete")
    public AjaxResult delete(String couponid){
        int result = couponService.deleteByPrimaryKey(couponid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

    @RequestMapping("/op/coupon/select")
    public AjaxResult select(String couponid) {
        Coupons coupons = couponService.selectByPrimaryKey(couponid);
        if (coupons !=null) {
            return ResponseTool.success(coupons);
        } else {
            return ResponseTool.failed("找不到指定的餐券");
        }
    }
}
