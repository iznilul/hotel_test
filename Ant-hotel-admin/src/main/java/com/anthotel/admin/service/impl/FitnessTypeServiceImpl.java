package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.FitnessTypeMapper;
import com.anthotel.admin.entity.FitnessType;
import com.anthotel.admin.service.FitnessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessTypeServiceImpl implements FitnessTypeService {
    @Autowired
    FitnessTypeMapper fitnessTypeMapper;
    @Override
    public int deleteByPrimaryKey(String fitnesstoolid){
        return fitnessTypeMapper.deleteByPrimaryKey(fitnesstoolid);
    }
    @Override
    public int insert(FitnessType record){
        return fitnessTypeMapper.insert(record);
    }
    @Override
    public FitnessType selectByPrimaryKey(String fitnesstoolid){
        return fitnessTypeMapper.selectByPrimaryKey(fitnesstoolid);
    }
    @Override
    public List<FitnessType> selectAll(){
        return fitnessTypeMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(FitnessType record) {
        return fitnessTypeMapper.updateByPrimaryKey(record);
    }
}


