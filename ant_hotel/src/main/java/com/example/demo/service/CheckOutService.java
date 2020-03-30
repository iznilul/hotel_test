package com.example.demo.service;

import com.example.demo.entity.CheckIn;
import com.example.demo.entity.CheckOut;

import java.util.List;

public interface CheckOutService {
    int deleteByPrimaryKey(String userid);

    int insert(CheckOut record);

    CheckOut selectByPrimaryKey(String userid);

    List<CheckOut> selectAll();

    int updateByPrimaryKey(CheckOut record);

}
