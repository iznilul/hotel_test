package com.example.demo.service;

import com.example.demo.entity.ReserveRecord;

import java.util.List;


public interface ReserveRecordService {
    ReserveRecord selectById(Integer reserveId);

    int insert(ReserveRecord reserveRecord);

    int delete(Integer reserveId);

    int update(ReserveRecord reserveRecord);

    List<ReserveRecord> selectAll();

    ReserveRecord selectLast();
}
