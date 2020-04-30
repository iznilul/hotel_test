package com.anthotel.admin.dao;

import com.anthotel.admin.entity.OnRecord;
import java.util.List;

public interface OnRecordMapper {
    int deleteByPrimaryKey(String userid);

    int insert(OnRecord record);

    List<OnRecord> selectByPrimaryKey(String userid);

    List<OnRecord> selectAll();

    int updateByPrimaryKey(OnRecord record);
}