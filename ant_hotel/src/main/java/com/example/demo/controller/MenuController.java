package com.example.demo.controller;

import com.example.demo.entity.Menu;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {
    @Autowired
    MenuService menuService;
//    增删改减的操作
    @RequestMapping(value = "/insert")
    public int insert(String foodId, String foodName, Integer price) {
        Menu menu = new Menu(foodId, foodName, price);
        int result = menuService.insert(menu);
        return result;
    }

    @RequestMapping(value = "/update")
    public int update(String foodId, String foodName, Integer price) {
        Menu menu = new Menu(foodId, foodName, price);
        int result = menuService.updateByPrimaryKey(menu);
        return result;
    }

    @RequestMapping(value = "/delete")
    public int delete(String foodId) {
        return menuService.deleteByPrimaryKey(foodId);
    }

    @RequestMapping(value = "/select")
    public Menu select(String foodId) {
        return menuService.selectByPrimaryKey(foodId);
    }

    @RequestMapping(value = "/show")
    public List<Menu> show(){
        return menuService.selectAll();
    }
}
