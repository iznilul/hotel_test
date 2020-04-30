package com.anthotel.admin.service;

import com.anthotel.admin.entity.Menu;

import java.util.List;

public interface MenuService {
    int deleteByPrimaryKey(String foodid);

    int insert(Menu record);

    Menu selectByPrimaryKey(String foodid);

    List<Menu> selectAll();

    int updateByPrimaryKey(Menu record);
}
