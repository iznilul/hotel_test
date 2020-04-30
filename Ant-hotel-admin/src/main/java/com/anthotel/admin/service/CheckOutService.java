package com.anthotel.admin.service;

import com.anthotel.admin.entity.CheckOut;

import java.util.List;

public interface CheckOutService {
    int deleteByPrimaryKey(String userid);

    int insert(CheckOut record);

    CheckOut selectByPrimaryKey(String userid);

    List<CheckOut> selectAll();

    int updateByPrimaryKey(CheckOut record);

}
