package com.example.demo.service.impl;

import com.example.demo.dao.RoomInfoMapper;
import com.example.demo.entity.RoomInfo;
import com.example.demo.service.RoomInfoService;
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

    @Override
    public int updateStatue(String roomid) {
        return roomInfoMapper.updateStatue(roomid);
    }

    public int updateBackStatue(String roomid) {
        return roomInfoMapper.updateBackStatue(roomid);
    }
}
