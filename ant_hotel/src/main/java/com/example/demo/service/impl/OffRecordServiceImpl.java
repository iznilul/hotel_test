package com.example.demo.service.impl;

import com.example.demo.dao.OffRecordMapper;
import com.example.demo.entity.OffRecord;
import com.example.demo.service.OffRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OffRecordServiceImpl implements OffRecordService {
    @Autowired
    OffRecordMapper offRecordMapper;

    public int deleteByPrimaryKey(String userid) {
        return offRecordMapper.deleteByPrimaryKey(userid);
    }

    public int insert(OffRecord record) {
        return offRecordMapper.insert(record);
    }

    public List<OffRecord> selectByPrimaryKey(String userid) {
        return offRecordMapper.selectByPrimaryKey(userid);
    }

    public List<OffRecord> selectAll() {
        return offRecordMapper.selectAll();
    }

    public int updateByPrimaryKey(OffRecord record) {
        return offRecordMapper.updateByPrimaryKey(record);
    }
}
