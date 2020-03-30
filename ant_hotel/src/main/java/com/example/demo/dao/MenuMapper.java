package com.example.demo.dao;

import com.example.demo.entity.Menu;
import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(String foodid);

    int insert(Menu record);

    Menu selectByPrimaryKey(String foodid);

    List<Menu> selectAll();

    int updateByPrimaryKey(Menu record);
}