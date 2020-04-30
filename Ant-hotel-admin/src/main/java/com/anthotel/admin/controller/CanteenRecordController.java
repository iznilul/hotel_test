package com.anthotel.admin.controller;

import com.anthotel.admin.entity.CanteenRecord;
import com.anthotel.admin.entity.Menu;
import com.anthotel.admin.entity.Order;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.CanteenRecordService;
import com.anthotel.admin.service.CouponService;
import com.anthotel.admin.service.MenuService;
import com.anthotel.admin.service.UserItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
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
    @RequestMapping("/user/menu")
    public AjaxResult showMenu(){
        List<Menu> list = menuService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("菜单里没东西");
        }
    }

    //    点菜服务
    @RequestMapping(value = "/user/order")
    public AjaxResult order(@RequestBody List<Order> orderlist, String couponid, HttpServletRequest request) {
        //orderlist{foodid,foodname,number}
        int coupon;
        Date ontime = new Date();
        HttpSession session = request.getSession();
        String userid = (String) session.getAttribute("id");
//        获取用户名
        String name = userItemService.selectByPrimaryKey(userid).getName();
        String food = "";
        int totalprice = 0;
//        判断餐券的编号，若为0表明不使用餐券，
//        其他的则根据coupon表选择相应的餐券标号，并在useritem现有用户表里将对应餐券数量-1
        if (couponid.equals("0"))
            coupon = 0;
        else {
            if (couponid.equals("1")) {
                userItemService.updateCoupon1(userid);
            } else if (couponid.equals("2")) {
                userItemService.updateCoupon2(userid);
            } else if (couponid.equals("3")) {
                userItemService.updateCoupon3(userid);
            }
            coupon = couponService.selectByPrimaryKey(couponid).getCouponrate();
        }
//        根据传入的json数据进行菜品名字的合并和总金额的计算
        for (int i = 0; i < orderlist.size(); i++) {
            Order order = orderlist.get(i);
            food += order.getFoodname() + " " + order.getNumber() + "\t";
            totalprice += (menuService.selectByPrimaryKey(order.getFoodid()).getPrice()) * (order.getNumber());
        }
//        最终金额为总金额-餐券数值
        int cost = totalprice - coupon;
//        插入，返回结果
        CanteenRecord canteenRecord = new CanteenRecord(userid, name, totalprice, coupon, cost, ontime, food);
        int result = canteenRecordService.insert(canteenRecord);
        if (result == 1) {
            return ResponseTool.success(canteenRecord);
        } else {
            return ResponseTool.failed("添加吃饭记录失败");
        }

    }
//    增删改减
    @RequestMapping("/op/canteen/delete")
    public AjaxResult delete(String userid) {
        int result = canteenRecordService.deleteByPrimaryKey(userid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }
    @RequestMapping("/op/canteen/select")
    public AjaxResult select(String userid) {

        List<CanteenRecord> list = canteenRecordService.selectByPrimaryKey(userid);
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("找不到指定人员的吃饭记录");
        }
    }
    @RequestMapping("/op/canteen/showrecord")
    public AjaxResult showRecord() {

        List<CanteenRecord> list = canteenRecordService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有吃饭记录");
        }
    }
}
