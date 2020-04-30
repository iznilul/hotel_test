package com.anthotel.admin.service;

import com.anthotel.admin.entity.UserItem;

import java.util.List;

public interface UserItemService {
    int deleteByPrimaryKey(String userid);

    int insert(UserItem record);

    UserItem selectByPrimaryKey(String userid);

    List<UserItem> selectAll();
    int updateByPrimaryKey(UserItem record);

//    更新餐券消耗
    int updateCoupon1(String userid);

    int updateCoupon2(String userid);

    int updateCoupon3(String userid);
}
