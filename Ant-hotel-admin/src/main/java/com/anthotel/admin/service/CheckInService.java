package com.anthotel.admin.service;

import com.anthotel.admin.entity.CheckIn;

import java.util.List;


public interface CheckInService {
//    int CheckIn(CheckIn checkIn);

    int insert(CheckIn record);

    int delete(String userId);

    int update(CheckIn record);

    CheckIn selectById(String userId);

    List<CheckIn> selectAll();


}
