package com.example.demo.service.impl;

import com.example.demo.dao.OnRecordMapper;
import com.example.demo.entity.OnRecord;
import com.example.demo.service.OnRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnRecordServiceImpl implements OnRecordService {
    @Autowired
    OnRecordMapper onRecordMapper;

    public int deleteByPrimaryKey(String userid) {
        return onRecordMapper.deleteByPrimaryKey(userid);
    }

    public int insert(OnRecord record) {
        return onRecordMapper.insert(record);
    }

    public List<OnRecord> selectByPrimaryKey(String userid) {
        return onRecordMapper.selectByPrimaryKey(userid);
    }

    public List<OnRecord> selectAll() {
        return onRecordMapper.selectAll();
    }

    public int updateByPrimaryKey(OnRecord record) {
        return onRecordMapper.updateByPrimaryKey(record);
    }
}
