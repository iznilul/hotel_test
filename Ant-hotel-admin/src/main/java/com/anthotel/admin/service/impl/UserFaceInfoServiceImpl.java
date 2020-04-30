package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.UserFaceInfoMapper;
import com.anthotel.admin.entity.UserFaceInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserFaceInfoServiceImpl {
    @Autowired
    UserFaceInfoMapper userFaceInfoMapper;

    public int deleteByPrimaryKey(String userid) {
        return userFaceInfoMapper.deleteByPrimaryKey(userid);
    }

    public int insert(UserFaceInfo record) {
        return userFaceInfoMapper.insert(record);
    }

    public UserFaceInfo selectByPrimaryKey(String userid) {
        return userFaceInfoMapper.selectByPrimaryKey(userid);
    }

    public List<UserFaceInfo> selectAll() {
        return userFaceInfoMapper.selectAll();
    }

    public int updateByPrimaryKey(UserFaceInfo record) {
        return userFaceInfoMapper.updateByPrimaryKey(record);
    }
}
