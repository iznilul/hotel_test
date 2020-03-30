package com.example.demo.controller;

import com.example.demo.entity.CanteenRecord;
import com.example.demo.entity.Menu;
import com.example.demo.entity.Order;
import com.example.demo.service.CanteenRecordService;
import com.example.demo.service.CouponService;
import com.example.demo.service.MenuService;
import com.example.demo.service.UserItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/CanteenRecord")
public class CanteenRecordController {
    @Autowired
    CanteenRecordService canteenRecordService;
    @Autowired
    UserItemService userItemService;
    @Autowired
    MenuService menuService;
    @Autowired
    CouponService couponService;
//    展示所有菜品
    @RequestMapping("")
    public List<Menu> showMenu(){
        return menuService.selectAll();
    }
//    点菜服务
    @RequestMapping(value = "/order")
    public int order(@RequestBody List<Order> orderlist,String userid,String couponid) {
        //orderlist{foodid,foodname,number}
        int coupon;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        获取当前时间
        String ontime = df.format(new Date());
//        获取用户名
        String name = userItemService.selectByPrimaryKey(userid).getName();
        String food="";
        int totalprice=0;
//        判断餐券的编号，若为0表明不使用餐券，
//        其他的则根据coupon表选择相应的餐券标号，并在useritem现有用户表里将对应餐券数量-1
        if(couponid.equals("0"))
            coupon=0;
        else{
            if (couponid.equals("1")) {
                userItemService.updateCoupon1(userid);
            }
            else if (couponid.equals("2")) {
                userItemService.updateCoupon2(userid);
            }
            else if (couponid.equals("3")) {
                userItemService.updateCoupon3(userid);
            }
            coupon = couponService.selectByPrimaryKey(couponid).getCouponrate();
        }
//        根据传入的json数据进行菜品名字的合并和总金额的计算
        for (int i = 0; i < orderlist.size(); i++) {
            Order order = orderlist.get(i);
            food += order.getFoodname()+" "+order.getNumber()+"\t";
            totalprice += (menuService.selectByPrimaryKey(order.getFoodid()).getPrice())*(order.getNumber());
        }
//        最终金额为总金额-餐券数值
        int cost = totalprice - coupon;
//        插入，返回结果
        CanteenRecord canteenRecord = new CanteenRecord(userid, name, totalprice, coupon, cost, ontime,food);
        return canteenRecordService.insert(canteenRecord);
    }
//    增删改减
    @RequestMapping("/delete")
    public int delete(String userid) {
        return canteenRecordService.deleteByPrimaryKey(userid);
    }
    @RequestMapping("/select")
    public List<CanteenRecord> select(String userid) {
        return canteenRecordService.selectByPrimaryKey(userid);
    }
    @RequestMapping("/showrecord")
    public List<CanteenRecord> showRecord() {
        return canteenRecordService.selectAll();
    }
}
