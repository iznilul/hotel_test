package com.example.demo.dao;

import com.example.demo.entity.UserItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserItemMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserItem record);

    UserItem selectByPrimaryKey(String userid);

    List<UserItem> selectAll();

    int updateByPrimaryKey(UserItem record);

    int updateCoupon1(String userid);

    int updateCoupon2(String userid);

    int updateCoupon3(String userid);
}