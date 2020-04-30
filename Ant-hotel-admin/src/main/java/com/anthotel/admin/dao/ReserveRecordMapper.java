package com.anthotel.admin.dao;

import com.anthotel.admin.entity.ReserveRecord;
import java.util.List;

public interface ReserveRecordMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(ReserveRecord record);

    ReserveRecord selectByPrimaryKey(String orderid);

    List<ReserveRecord> selectAll();

    int updateByPrimaryKey(ReserveRecord record);
}