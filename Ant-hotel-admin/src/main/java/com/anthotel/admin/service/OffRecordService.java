package com.anthotel.admin.service;

import com.anthotel.admin.entity.OffRecord;

import java.util.List;

public interface OffRecordService {
    int deleteByPrimaryKey(String userid);

    int insert(OffRecord record);

    List<OffRecord> selectByPrimaryKey(String userid);

    List<OffRecord> selectAll();

    int updateByPrimaryKey(OffRecord record);
}
