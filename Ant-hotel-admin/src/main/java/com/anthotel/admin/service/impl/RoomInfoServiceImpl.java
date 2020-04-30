package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.RoomInfoMapper;
import com.anthotel.admin.entity.RoomInfo;
import com.anthotel.admin.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomInfoServiceImpl implements RoomInfoService {
    @Autowired
    RoomInfoMapper roomInfoMapper;
    @Override
    public List<RoomInfo> selectAll(){
        return roomInfoMapper.selectAll();
    }
    @Override
    public int deleteByPrimaryKey(String roomid){
        return roomInfoMapper.deleteByPrimaryKey(roomid);
    }
    @Override
    public RoomInfo selectByPrimaryKey(String roomid){
        return roomInfoMapper.selectByPrimaryKey(roomid);
    }

    @Override
    public int insert(RoomInfo roomInfo) {
        return roomInfoMapper.insert(roomInfo);
    }
    @Override
    public int updateByPrimaryKey(RoomInfo roomInfo){
        return roomInfoMapper.updateByPrimaryKey(roomInfo);
    }
    @Override
    public List<RoomInfo> selectFree(){
        return roomInfoMapper.selectFree();}

    public int updateFree(String roomid) {
        return roomInfoMapper.updateFree(roomid);
    }

    public int updateFull(String roomid) {
        return roomInfoMapper.updateFull(roomid);
    }

    public int updateReserve(String roomid) {
        return roomInfoMapper.updateReserve(roomid);
    }
}
