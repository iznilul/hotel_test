package com.anthotel.admin.dao;

import com.anthotel.admin.entity.FitnessRecord;
import java.util.List;

public interface FitnessRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(FitnessRecord record);

    List<FitnessRecord> selectByPrimaryKey(String userid);

    List<FitnessRecord> selectAll();

    int updateByPrimaryKey(FitnessRecord record);
}