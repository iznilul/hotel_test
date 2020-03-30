package com.example.demo.dao;

import com.example.demo.entity.FitnessRecord;
import java.util.List;

public interface FitnessRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(FitnessRecord record);

    List<FitnessRecord> selectByPrimaryKey(String userid);

    List<FitnessRecord> selectAll();

    int updateByPrimaryKey(FitnessRecord record);
}