package com.example.demo.service.impl;

import com.example.demo.dao.RoomLiveRecordMapper;
import com.example.demo.entity.RoomLiveRecord;
import com.example.demo.service.RoomLiveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RoomLiveRecordServiceImpl implements RoomLiveRecordService {
    @Autowired
    RoomLiveRecordMapper roomLiveRecordMapper;
    @Override
    public int deleteByPrimaryKey(String userid){
        return roomLiveRecordMapper.deleteByPrimaryKey(userid);
    }
    @Override
    public int insert(RoomLiveRecord record){
        return roomLiveRecordMapper.insert(record);
    }
    @Override
    public RoomLiveRecord selectByPrimaryKey(String userid){
        return roomLiveRecordMapper.selectByPrimaryKey(userid);
    }
    @Override
    public List<RoomLiveRecord> selectAll(){
        return roomLiveRecordMapper.selectAll();
    }
    @Override
    public int updateByPrimaryKey(RoomLiveRecord record){
        return roomLiveRecordMapper.updateByPrimaryKey(record);
    }
    @Override
    public int updateLeave(RoomLiveRecord record) {
        return roomLiveRecordMapper.updateLeave(record);
    }
}
