package com.anthotel.admin.service;

import com.anthotel.admin.entity.CanteenRecord;

import java.util.List;

public interface CanteenRecordService {
    int deleteByPrimaryKey(String userid);

    int insert(CanteenRecord record);

    List<CanteenRecord> selectByPrimaryKey(String userid);

    List<CanteenRecord> selectAll();

    int updateByPrimaryKey(CanteenRecord record);
}
