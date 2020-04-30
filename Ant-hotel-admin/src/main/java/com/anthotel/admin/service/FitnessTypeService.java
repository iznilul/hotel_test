package com.anthotel.admin.service;

import com.anthotel.admin.entity.FitnessType;

import java.util.List;

public interface FitnessTypeService {
    int deleteByPrimaryKey(String fitnesstoolid);

    int insert(FitnessType record);

    FitnessType selectByPrimaryKey(String fitnesstoolid);

    List<FitnessType> selectAll();

    int updateByPrimaryKey(FitnessType record);
}
