package com.example.demo.dao;

import com.example.demo.entity.CheckOut;
import java.util.List;

public interface CheckOutMapper {
    int deleteByPrimaryKey(String userid);

    int insert(CheckOut record);

    CheckOut selectByPrimaryKey(String userid);

    List<CheckOut> selectAll();

    int updateByPrimaryKey(CheckOut record);
}