package com.example.demo.dao;

import com.example.demo.entity.RoomInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoomInfoMapper {
    int deleteByPrimaryKey(String roomid);

    int insert(RoomInfo record);

    RoomInfo selectByPrimaryKey(String roomid);

    List<RoomInfo> selectAll();

    int updateByPrimaryKey(RoomInfo record);

    List<RoomInfo> selectFree();

    int updateStatue(String roomid);
}