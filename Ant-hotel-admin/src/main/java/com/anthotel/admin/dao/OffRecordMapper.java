package com.anthotel.admin.dao;

import com.anthotel.admin.entity.OffRecord;
import java.util.List;

public interface OffRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(OffRecord record);

    List<OffRecord> selectByPrimaryKey(String userid);

    List<OffRecord> selectAll();

    int updateByPrimaryKey(OffRecord record);
}