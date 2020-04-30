package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.LoginMapper;
import com.anthotel.admin.entity.Login;
import com.anthotel.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    public int deleteByPrimaryKey(String id) {
        return loginMapper.deleteByPrimaryKey(id);
    }

    public int insert(Login record) {
        return loginMapper.insert(record);
    }

    public Login selectByPrimaryKey(String id) {
        return loginMapper.selectByPrimaryKey(id);
    }

    public List<Login> selectAll() {
        return loginMapper.selectAll();
    }

    public int updateByPrimaryKey(Login record) {
        return loginMapper.updateByPrimaryKey(record);
    }

    public Login selectByName(String name) {
        return loginMapper.selectByName(name);
    }

    public String selectPassword(String name) {
        return loginMapper.selectPassword(name);
    }

    public String selectRole(String name) {
        return loginMapper.selectRole(name);
    }
}
