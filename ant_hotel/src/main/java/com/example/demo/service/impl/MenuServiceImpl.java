package com.example.demo.service.impl;

import com.example.demo.dao.MenuMapper;
import com.example.demo.entity.Menu;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> selectAll(){
        return menuMapper.selectAll();
    }
    @Override
    public int insert(Menu menu) {
        return menuMapper.insert(menu);
    }
    @Override
    public int deleteByPrimaryKey(String foodId){
        return menuMapper.deleteByPrimaryKey(foodId);
    }

    @Override
    public int updateByPrimaryKey(Menu menu) {
        return menuMapper.updateByPrimaryKey(menu);
    }
    @Override
    public Menu selectByPrimaryKey(String foodId){
        return menuMapper.selectByPrimaryKey(foodId);
    }
}
