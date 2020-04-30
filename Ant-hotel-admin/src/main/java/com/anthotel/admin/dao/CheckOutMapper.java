package com.anthotel.admin.dao;

import com.anthotel.admin.entity.CheckOut;
import java.util.List;

public interface CheckOutMapper {
    int deleteByPrimaryKey(String userid);

    int insert(CheckOut record);

    CheckOut selectByPrimaryKey(String userid);

    List<CheckOut> selectAll();

    int updateByPrimaryKey(CheckOut record);
}