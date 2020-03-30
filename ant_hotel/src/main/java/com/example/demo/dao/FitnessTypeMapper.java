package com.example.demo.dao;

import com.example.demo.entity.FitnessType;
import java.util.List;

public interface FitnessTypeMapper {
    int deleteByPrimaryKey(String fitnesstoolid);

    int insert(FitnessType record);

    FitnessType selectByPrimaryKey(String fitnesstoolid);

    List<FitnessType> selectAll();

    int updateByPrimaryKey(FitnessType record);
}