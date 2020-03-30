package com.example.demo.dao;

import com.example.demo.entity.RoomLiveRecord;

import java.math.BigDecimal;
import java.util.List;

public interface RoomLiveRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(RoomLiveRecord record);

    RoomLiveRecord selectByPrimaryKey(String userid);

    List<RoomLiveRecord> selectAll();

    int updateByPrimaryKey(RoomLiveRecord record);

    int updateLeave(RoomLiveRecord record);
}