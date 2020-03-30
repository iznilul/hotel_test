package com.example.demo.service.impl;

import com.example.demo.dao.CanteenRecordMapper;
import com.example.demo.entity.CanteenRecord;
import com.example.demo.service.CanteenRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenRecordServiceImpl implements CanteenRecordService {
    @Autowired
    CanteenRecordMapper canteenRecordMapper;

    public int deleteByPrimaryKey(String userid) {
        return canteenRecordMapper.deleteByPrimaryKey(userid);
    }

    public int insert(CanteenRecord record) {
        return canteenRecordMapper.insert(record);
    }

    public List<CanteenRecord> selectByPrimaryKey(String userid) {
        return canteenRecordMapper.selectByPrimaryKey(userid);
    }

    public List<CanteenRecord> selectAll() {
        return canteenRecordMapper.selectAll();
    }

    public int updateByPrimaryKey(CanteenRecord record) {
        return canteenRecordMapper.updateByPrimaryKey(record);
    }
}
