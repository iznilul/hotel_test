package com.anthotel.admin.dao;

import com.anthotel.admin.entity.UserFaceInfo;
import java.util.List;

public interface UserFaceInfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserFaceInfo record);

    UserFaceInfo selectByPrimaryKey(String userid);

    List<UserFaceInfo> selectAll();

    int updateByPrimaryKey(UserFaceInfo record);
}