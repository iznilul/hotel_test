package com.anthotel.admin.dao;

import com.anthotel.admin.entity.Login;

import java.util.List;

public interface LoginMapper {
    int deleteByPrimaryKey(String id);

    int insert(Login record);

    Login selectByPrimaryKey(String id);

    List<Login> selectAll();

    int updateByPrimaryKey(Login record);

    Login selectByName(String name);

    String selectPassword(String name);

    String selectRole(String name);
}