package com.example.demo.service;

import com.example.demo.entity.FitnessRecord;

import java.util.List;

public interface FitnessRecordService {

    int deleteByPrimaryKey(String userid);

    int insert(FitnessRecord record);

    List<FitnessRecord> selectByPrimaryKey(String userid);

    List<FitnessRecord> selectAll();

    int updateByPrimaryKey(FitnessRecord record);

}
