package com.anthotel.admin.controller;

import com.anthotel.admin.entity.RoomInfo;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class RoomInfoController {
    @Autowired
    RoomInfoService roomInfoService;
//    路径为空时展示所有房间
    @RequestMapping(value = "/op/roomInfo/show")
    public AjaxResult show(){
        List<RoomInfo> list=roomInfoService.selectAll();
        if (list != null) {
            return ResponseTool.success(list);
        }else{
            return ResponseTool.failed("当前没有房间");
        }
    }
//    剩下的就是一些增删改减操作
    @RequestMapping(value = "/op/roomInfo/insert",method = RequestMethod.POST)
    public AjaxResult insert(String roomid, String roomStatus){
        RoomInfo roomInfo = new RoomInfo(roomid, roomStatus);
        int result=roomInfoService.insert(roomInfo);
        if (result == 1) {
            return ResponseTool.success(roomInfo);
        } else {
            return ResponseTool.failed("添加房间信息失败");
        }
    }
    @RequestMapping(value="/op/roomInfo/delete",method = RequestMethod.POST)
    public AjaxResult delete(String roomid){
        int result = roomInfoService.deleteByPrimaryKey(roomid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }
    @RequestMapping(value="/op/roomInfo/select",method = RequestMethod.POST)
    public AjaxResult select(String roomid){
        RoomInfo roomInfo = roomInfoService.selectByPrimaryKey(roomid);
        if (roomInfo != null) {
            return ResponseTool.success(roomInfo);
        } else {
            return ResponseTool.failed("找不到指定房间");
        }
    }
    @RequestMapping(value="/op/roomInfo/update",method = RequestMethod.POST)
    public AjaxResult update(String roomid, String roomStatus){
        RoomInfo roomInfo = new RoomInfo(roomid, roomStatus);
        int result = roomInfoService.updateByPrimaryKey(roomInfo);
        if (result == 1) {
            return ResponseTool.success(roomInfo);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

}
