package com.example.demo.dao;

import com.example.demo.entity.ReserveRecord;
import java.util.List;

public interface ReserveRecordMapper {
    int deleteByPrimaryKey(Integer reserveid);

    int insert(ReserveRecord record);

    ReserveRecord selectByPrimaryKey(Integer reserveid);

    List<ReserveRecord> selectAll();

    int updateByPrimaryKey(ReserveRecord record);

    ReserveRecord selectLast();
}