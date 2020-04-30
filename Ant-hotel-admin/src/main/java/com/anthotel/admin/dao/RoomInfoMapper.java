package com.anthotel.admin.dao;

import com.anthotel.admin.entity.RoomInfo;
import java.util.List;

public interface RoomInfoMapper {
    int deleteByPrimaryKey(String roomid);

    int insert(RoomInfo record);

    RoomInfo selectByPrimaryKey(String roomid);

    List<RoomInfo> selectAll();

    int updateByPrimaryKey(RoomInfo record);

    List<RoomInfo> selectFree();

    int updateFree(String roomid);

    int updateFull(String roomid);

    int updateReserve(String roomid);
}