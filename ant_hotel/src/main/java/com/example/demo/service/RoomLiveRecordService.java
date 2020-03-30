package com.example.demo.service;

import com.example.demo.entity.RoomLiveRecord;

import java.math.BigDecimal;
import java.util.List;

public interface RoomLiveRecordService {
    int deleteByPrimaryKey(String userid);

    int insert(RoomLiveRecord record);

    RoomLiveRecord selectByPrimaryKey(String userid);

    List<RoomLiveRecord> selectAll();

    int updateByPrimaryKey(RoomLiveRecord record);
    //退房时更新退房金额和时间
    int updateLeave(RoomLiveRecord record);
}
