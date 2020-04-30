package com.anthotel.admin.dao;

import com.anthotel.admin.entity.RoomLiveRecord;
import java.util.List;

public interface RoomLiveRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(RoomLiveRecord record);

    RoomLiveRecord selectByPrimaryKey(String userid);

    List<RoomLiveRecord> selectAll();

    int updateByPrimaryKey(RoomLiveRecord record);

    int updateLeave(RoomLiveRecord record);
}