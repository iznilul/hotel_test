package com.anthotel.admin.service;

import com.anthotel.admin.entity.ReserveRecord;

import java.util.List;


public interface ReserveRecordService {
    ReserveRecord selectById(String reserveId);

    int insert(ReserveRecord reserveRecord);

    int delete(String reserveId);

    int update(ReserveRecord reserveRecord);

    List<ReserveRecord> selectAll();

    ReserveRecord selectLast();

    String selectRoomId(String reserveid);
}
