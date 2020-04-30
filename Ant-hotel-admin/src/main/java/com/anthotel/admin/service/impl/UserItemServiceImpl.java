package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.UserItemMapper;
import com.anthotel.admin.entity.UserItem;
import com.anthotel.admin.service.UserItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserItemServiceImpl implements UserItemService {
    @Autowired
    UserItemMapper userItemMapper;

    public int deleteByPrimaryKey(String userid) {
        return userItemMapper.deleteByPrimaryKey(userid);
    }

    public int insert(UserItem record) {
        return userItemMapper.insert(record);
    }

    public UserItem selectByPrimaryKey(String userid) {
        return userItemMapper.selectByPrimaryKey(userid);
    }

    public List<UserItem> selectAll() {
        return userItemMapper.selectAll();
    }

    public int updateByPrimaryKey(UserItem record) {
        return userItemMapper.updateByPrimaryKey(record);
    }

    public int updateCoupon1(String userid){
        return userItemMapper.updateCoupon1(userid);
    }
    public int updateCoupon2(String userid){
        return userItemMapper.updateCoupon2(userid);
    }

    public int updateCoupon3(String userid){
        return userItemMapper.updateCoupon3(userid);
    }
}
