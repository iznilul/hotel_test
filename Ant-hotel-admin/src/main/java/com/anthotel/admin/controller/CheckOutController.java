package com.anthotel.admin.controller;

import com.anthotel.admin.entity.CheckIn;
import com.anthotel.admin.entity.CheckOut;
import com.anthotel.admin.entity.RoomLiveRecord;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class CheckOutController {
    @Autowired
    CheckOutService checkOutService;
    @Autowired
    RoomLiveRecordService roomLiveRecordService;
    @Autowired
    UserItemService userItemService;
    @Autowired
    RoomInfoService roomInfoService;
    @Autowired
    HotelRoomInfoService hotelRoomInfoService;
    @Autowired
    CheckInService checkInService;
//    退房操作
    @RequestMapping(value = "/user/checkOut")
    public AjaxResult insert(HttpServletRequest request) {
//        计算价格
        Date leavetime = new Date();
        Date updatetime = new Date();
        HttpSession session = request.getSession();
        String userid = (String)session.getAttribute("id");
        CheckIn checkIn = checkInService.selectById(userid);
        String name = checkIn.getName();
        String roomid = checkIn.getRoomid();
        String phonenumber = checkIn.getPhonenumber();
        BigDecimal cost = hotelRoomInfoService.selectByHotelId(roomid.substring(0, 9)).getRoomprice();
        CheckOut checkOut = new CheckOut(userid, name, roomid, phonenumber,cost, leavetime,  updatetime);
        RoomLiveRecord roomLiveRecord = new RoomLiveRecord(userid, null, null, leavetime, null, cost);
//        在checkout退房表里插入，在roomliverecord居住记录表里更新，在useritem现有用户表里删除用户
        int result = (checkOutService.insert(checkOut) & (roomLiveRecordService.updateLeave(roomLiveRecord)) & (userItemService.deleteByPrimaryKey(userid)) & (roomInfoService.updateFree(roomid))&(hotelRoomInfoService.updateCountPlus(roomid.substring(0,9))));
        if (result == 1) {
            return ResponseTool.success(checkOut);
        } else {
            return ResponseTool.failed("添加退房记录失败");
        }
    }
//    增删改减
    @RequestMapping("/op/checkOut/update")
    public AjaxResult update(String userid, String name, String roomid, String phonenumber,Date checkouttime,BigDecimal cost) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String updatetime = df.format(new Date());
        Date updatetime = new Date();
        CheckOut checkOut = new CheckOut(userid, name, roomid, phonenumber,  cost, checkouttime, updatetime);
        int result = checkOutService.updateByPrimaryKey(checkOut);
        if (result == 1) {
            return ResponseTool.success(checkOut);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping("/op/checkOut/delete")
    public AjaxResult delete(String userid) {

        int result = checkOutService.deleteByPrimaryKey(userid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

    @RequestMapping("/op/checkOut/select")
    public AjaxResult select(String userid) {

        CheckOut checkOut = checkOutService.selectByPrimaryKey(userid);
        if (checkOut !=null) {
            return ResponseTool.success(checkOut);
        } else {
            return ResponseTool.failed("找不到指定人员的退房记录");
        }
    }

    @RequestMapping("/op/checkOut/show")
    public AjaxResult show() {

        List<CheckOut> list = checkOutService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有退房记录");
        }
    }
}
