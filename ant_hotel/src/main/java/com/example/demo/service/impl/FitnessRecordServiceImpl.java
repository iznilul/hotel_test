package com.example.demo.service.impl;

import com.example.demo.dao.FitnessRecordMapper;
import com.example.demo.entity.FitnessRecord;
import com.example.demo.service.FitnessRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessRecordServiceImpl implements FitnessRecordService {
    @Autowired
    FitnessRecordMapper fitnessRecordMapper;

    @Override
    public int deleteByPrimaryKey(String userid) {
        return fitnessRecordMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(FitnessRecord record) {
        return fitnessRecordMapper.insert(record);
    }

    @Override
    public List<FitnessRecord> selectByPrimaryKey(String userid) {
        return fitnessRecordMapper.selectByPrimaryKey(userid);
    }

    @Override
    public List<FitnessRecord> selectAll() {
        return fitnessRecordMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(FitnessRecord record) {
        return fitnessRecordMapper.updateByPrimaryKey(record);
    }
}
