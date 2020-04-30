package com.anthotel.admin.service;

import com.anthotel.admin.entity.RoomLiveRecord;

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
