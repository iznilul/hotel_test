package com.example.demo.controller;


import com.example.demo.entity.CheckIn;
import com.example.demo.entity.RoomInfo;
import com.example.demo.entity.RoomLiveRecord;
import com.example.demo.entity.UserItem;
import com.example.demo.service.CheckInService;
import com.example.demo.service.RoomInfoService;
import com.example.demo.service.RoomLiveRecordService;
import com.example.demo.service.UserItemService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/CheckIn")
public class CheckInController {
    @Autowired
    CheckInService checkInService;
    @Autowired
    RoomInfoService roomInfoService;
    @Autowired
    RoomLiveRecordService roomLiveRecordService;
    @Autowired
    UserItemService userItemService;
    @RequestMapping(value = "")
    public List<RoomInfo> showFree(){
        return roomInfoService.selectFree();
    }
//    登记操作
    @RequestMapping(value="/checkIn")
//    传入所需参数，其中reserveid可以无数据
    public int insert(String userId, String reserveId, String name,String roomNumber, String roomType){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        获得当前时间
        String checkInTime = df.format(new Date());
        String updateTime = df.format(new Date());
        CheckIn checkIn=new CheckIn(userId, reserveId, name,roomNumber, roomType, checkInTime, updateTime);
        RoomLiveRecord roomLiveRecord = new RoomLiveRecord(userId, name, checkInTime, null, roomNumber, (BigDecimal.ZERO));
        UserItem userItem = new UserItem(userId, name, roomNumber, Boolean.TRUE,Boolean.TRUE, 1, 1, 1);
//        在checkin登记表里插入，roominfo房间信息表里更新房间状态（roomstatus设为0），roomliverecord居住记录表里插入，useritem现有用户表里插入（分配钥匙，房卡，餐券）
//        如果返回0，可能是有个表出了问题~ o(*￣▽￣*)o
        return (checkInService.insert(checkIn) & (roomInfoService.updateStatue(roomNumber)) & (roomLiveRecordService.insert(roomLiveRecord)) & (userItemService.insert(userItem)));
    }
//    增删改减
    @RequestMapping("/update")
    public int update(String userid, String reserveid,String name, String roomid, String roomtype, BigDecimal cost) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String updatetime = df.format(new Date());
        CheckIn checkIn = new CheckIn(userid, reserveid,name, roomid, roomtype, "", updatetime);
        return checkInService.update(checkIn);
    }

    @RequestMapping("/delete")
    public int delete(String userid) {
        return checkInService.delete(userid);
    }

    @RequestMapping("/select")
    public CheckIn select(String userid) {
        return checkInService.selectById(userid);
    }

    @RequestMapping("/show")
    public List<CheckIn> show() {
        return checkInService.selectAll();
    }

}
