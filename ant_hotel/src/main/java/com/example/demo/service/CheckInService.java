package com.example.demo.service;

import com.example.demo.entity.CheckIn;
import com.example.demo.entity.RoomInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CheckInService {
//    int CheckIn(CheckIn checkIn);

    int insert(CheckIn record);

    int delete(String userId);

    int update(CheckIn record);

    CheckIn selectById(String userId);

    List<CheckIn> selectAll();


}
