package com.example.demo.dao;

import com.example.demo.entity.CheckIn;
import java.util.List;

public interface CheckInMapper {
    int deleteByPrimaryKey(String userid);

    int insert(CheckIn record);

    CheckIn selectByPrimaryKey(String userid);

    List<CheckIn> selectAll();

    int updateByPrimaryKey(CheckIn record);
}