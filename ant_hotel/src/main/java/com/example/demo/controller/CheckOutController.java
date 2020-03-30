package com.example.demo.controller;

import com.example.demo.entity.CheckOut;
import com.example.demo.entity.RoomInfo;
import com.example.demo.entity.RoomLiveRecord;
import com.example.demo.service.CheckOutService;
import com.example.demo.service.RoomInfoService;
import com.example.demo.service.RoomLiveRecordService;
import com.example.demo.service.UserItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/CheckOut")
public class CheckOutController {
    @Autowired
    CheckOutService checkOutService;
    @Autowired
    RoomLiveRecordService roomLiveRecordService;
    @Autowired
    UserItemService userItemService;
    @Autowired
    RoomInfoService roomInfoService;
//    退房操作
    @RequestMapping(value = "/insert")
    public int insert(String userid, String name, String roomid, String roomtype) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String leavetime = df.format(new Date());
        String updatetime = df.format(new Date());
//        计算价格
        BigDecimal cost = roomInfoService.selectByPrimaryKey(roomid).getRoomprice();
        CheckOut checkOut = new CheckOut(userid, name, roomid, roomtype, leavetime, cost, updatetime);
        RoomLiveRecord roomLiveRecord = new RoomLiveRecord(userid, null, null, leavetime, null, cost);
//        在checkout退房表里插入，在roomliverecord居住记录表里更新，在useritem现有用户表里删除用户
        return (checkOutService.insert(checkOut) & (roomLiveRecordService.updateLeave(roomLiveRecord)) & (userItemService.deleteByPrimaryKey(userid)));
    }
//    增删改减
    @RequestMapping("/update")
    public int update(String userid, String name, String roomid, String roomtype, BigDecimal cost) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String updatetime = df.format(new Date());
        CheckOut checkOut = new CheckOut(userid, name, roomid, roomtype, "", cost, updatetime);
        return checkOutService.updateByPrimaryKey(checkOut);
    }

    @RequestMapping("/delete")
    public int delete(String userid) {
        return checkOutService.deleteByPrimaryKey(userid);
    }

    @RequestMapping("/select")
    public CheckOut select(String userid) {
        return checkOutService.selectByPrimaryKey(userid);
    }

    @RequestMapping("/show")


    public List<CheckOut> show() {
        return checkOutService.selectAll();
    }
}
