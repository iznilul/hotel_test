package com.anthotel.admin.controller;


import com.anthotel.admin.entity.CheckIn;
import com.anthotel.admin.entity.RoomInfo;
import com.anthotel.admin.entity.RoomLiveRecord;
import com.anthotel.admin.entity.UserItem;
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
public class CheckInController {
    @Autowired
    CheckInService checkInService;
    @Autowired
    RoomInfoService roomInfoService;
    @Autowired
    RoomLiveRecordService roomLiveRecordService;
    @Autowired
    UserItemService userItemService;
    @Autowired
    HotelRoomInfoService hotelRoomInfoService;
    @RequestMapping(value = "/user/showFree")
    public AjaxResult showFree(){
        List<RoomInfo> list = roomInfoService.selectFree();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有空余房间");
        }
    }
//    登记操作
    @RequestMapping(value="/user/checkIn")
//    传入所需参数，其中reserveid可以无数据
    public AjaxResult insert(String name,String roomid,String phonenumber,HttpServletRequest request){
        HttpSession session = request.getSession();
        String userid = (String)session.getAttribute("id");
        Date checkInTime = new Date();
        Date updateTime = new Date();
        CheckIn checkIn=new CheckIn(userid, name,roomid, phonenumber, checkInTime, updateTime);
        RoomLiveRecord roomLiveRecord = new RoomLiveRecord(userid, name, checkInTime, null, roomid, (BigDecimal.ZERO));
        UserItem userItem = new UserItem(userid, name, roomid, Boolean.TRUE,Boolean.TRUE, 1, 1, 1);
//        在checkin登记表里插入，roominfo房间信息表里更新房间状态（roomstatus设为0），roomliverecord居住记录表里插入，useritem现有用户表里插入（分配钥匙，房卡，餐券）
//        如果返回0，可能是有个表出了问题~ o(*￣▽￣*)o
        int result = (checkInService.insert(checkIn)& (roomInfoService.updateFull(roomid))  & (roomLiveRecordService.insert(roomLiveRecord)) & (userItemService.insert(userItem))&(hotelRoomInfoService.updateCountReduce(roomid.substring(0,9))));
        if (result == 1) {
            return ResponseTool.success(checkIn);
        } else {
            return ResponseTool.failed("添加登记记录失败");
        }
    }
//    增删改减
    @RequestMapping("/op/checkIn/update")
    public AjaxResult update(String userid, String name, String roomid, String phonenumber, Date checkintime) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String updatetime = df.format(new Date());
        Date updatetime = new Date();
        CheckIn checkIn = new CheckIn(userid, name, roomid, phonenumber, checkintime, updatetime);
        int result = checkInService.update(checkIn);
        if (result == 1) {
            return ResponseTool.success(checkIn);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping("/op/checkIn/delete")
    public AjaxResult delete(String userid) {
        int result = checkInService.delete(userid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

    @RequestMapping("/op/checkIn/select")
    public AjaxResult select(String userid) {
        CheckIn checkIn = checkInService.selectById(userid);
        if (checkIn !=null) {
            return ResponseTool.success(checkIn);
        } else {
            return ResponseTool.failed("找不到指定人员的登记记录");
        }
    }

    @RequestMapping("/op/checkIn/show")
    public AjaxResult show() {
        List<CheckIn> list = checkInService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有登记记录");
        }
    }

}

