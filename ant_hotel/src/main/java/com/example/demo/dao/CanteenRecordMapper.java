package com.example.demo.dao;

import com.example.demo.entity.CanteenRecord;
import java.util.List;

public interface CanteenRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(CanteenRecord record);

    List<CanteenRecord> selectByPrimaryKey(String userid);

    List<CanteenRecord> selectAll();

    int updateByPrimaryKey(CanteenRecord record);
}