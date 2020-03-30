package com.example.demo.service;

import com.example.demo.entity.CanteenRecord;

import java.util.List;

public interface CanteenRecordService {
    int deleteByPrimaryKey(String userid);

    int insert(CanteenRecord record);

    List<CanteenRecord> selectByPrimaryKey(String userid);

    List<CanteenRecord> selectAll();

    int updateByPrimaryKey(CanteenRecord record);
}
