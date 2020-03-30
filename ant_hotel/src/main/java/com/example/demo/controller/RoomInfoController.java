package com.example.demo.controller;

import com.example.demo.entity.RoomInfo;
import com.example.demo.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/roomInfo")
public class RoomInfoController {
    @Autowired
    RoomInfoService roomInfoService;
//    路径为空时展示所有房间
    @RequestMapping(value = "")
    public List<RoomInfo> show(){
        List<RoomInfo> list=roomInfoService.selectAll();
        return list;
    }
//    剩下的就是一些增删改减操作
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insert(String roomId, String roomType, String roomStatus, BigDecimal roomPrice, BigDecimal hourPrice){
        RoomInfo roomInfo = new RoomInfo(roomId, roomType,roomStatus, roomPrice, hourPrice);
        int result=roomInfoService.insert(roomInfo);
        return result;
    }
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public int delete(String roomId){
        int result = roomInfoService.deleteByPrimaryKey(roomId);
        return result;
    }
    @RequestMapping(value="/select",method = RequestMethod.POST)
    public RoomInfo select(String roomId){
        RoomInfo roomInfo = roomInfoService.selectByPrimaryKey(roomId);
        return roomInfo;
    }
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public int update(String roomId, String roomType, String roomStatus, BigDecimal roomPrice, BigDecimal hourPrice){
        RoomInfo roomInfo = new RoomInfo(roomId, roomType, roomStatus, roomPrice, hourPrice);
        int result = roomInfoService.updateByPrimaryKey(roomInfo);
        return result;
    }

}
