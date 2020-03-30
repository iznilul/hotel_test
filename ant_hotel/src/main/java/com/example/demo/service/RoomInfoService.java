package com.example.demo.service;


import com.example.demo.entity.RoomInfo;

import java.util.List;

public interface RoomInfoService {

    int deleteByPrimaryKey(String roomid);

    int insert(RoomInfo record);

    RoomInfo selectByPrimaryKey(String roomid);

    List<RoomInfo> selectAll();

    int updateByPrimaryKey(RoomInfo record);

//    展示空闲房间
    List<RoomInfo> selectFree();
//    更新房间状态
    int updateStatue(String roomid);
}
