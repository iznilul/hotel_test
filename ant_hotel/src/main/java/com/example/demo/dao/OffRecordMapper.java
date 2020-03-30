package com.example.demo.dao;

import com.example.demo.entity.OffRecord;
import java.util.List;

public interface OffRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(OffRecord record);

    List<OffRecord> selectByPrimaryKey(String userid);

    List<OffRecord> selectAll();

    int updateByPrimaryKey(OffRecord record);
}