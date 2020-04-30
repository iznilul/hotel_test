package com.anthotel.admin.service;

import com.anthotel.admin.entity.FitnessRecord;

import java.util.List;

public interface FitnessRecordService {

    int deleteByPrimaryKey(String userid);

    int insert(FitnessRecord record);

    List<FitnessRecord> selectByPrimaryKey(String userid);

    List<FitnessRecord> selectAll();

    int updateByPrimaryKey(FitnessRecord record);

}
