package com.example.demo.dao;

import com.example.demo.entity.OnRecord;
import java.util.List;

public interface OnRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(OnRecord record);

    List<OnRecord> selectByPrimaryKey(String userid);

    List<OnRecord> selectAll();

    int updateByPrimaryKey(OnRecord record);
}