package com.anthotel.admin.dao;

import com.anthotel.admin.entity.CheckIn;
import java.util.List;

public interface CheckInMapper {
    int deleteByPrimaryKey(String userid);

    int insert(CheckIn record);

    CheckIn selectByPrimaryKey(String userid);

    List<CheckIn> selectAll();

    int updateByPrimaryKey(CheckIn record);
}