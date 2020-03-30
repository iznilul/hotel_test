package com.example.demo.service;

import com.example.demo.entity.OffRecord;

import java.util.List;

public interface OffRecordService {
    int deleteByPrimaryKey(String userid);

    int insert(OffRecord record);

    List<OffRecord> selectByPrimaryKey(String userid);

    List<OffRecord> selectAll();

    int updateByPrimaryKey(OffRecord record);
}
