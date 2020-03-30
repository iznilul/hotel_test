package com.example.demo.service;

import com.example.demo.entity.OnRecord;

import java.util.List;

public interface OnRecordService {
    int deleteByPrimaryKey(String userid);

    int insert(OnRecord record);

    List<OnRecord> selectByPrimaryKey(String userid);

    List<OnRecord> selectAll();

    int updateByPrimaryKey(OnRecord record);
}
