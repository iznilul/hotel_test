package com.anthotel.admin.controller;

import com.anthotel.admin.entity.Menu;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;
//    增删改减的操作
    @RequestMapping(value = "/op/menu/insert")
    public AjaxResult insert(String foodid, String foodname, Integer price) {
        Menu menu = new Menu(foodid, foodname, price);
        int result = menuService.insert(menu);
        if (result == 1) {
            return ResponseTool.success(menu);
        } else {
            return ResponseTool.failed("添加食物失败");
        }
    }

    @RequestMapping(value = "/op/menu/update")
    public AjaxResult update(String foodid, String foodname, Integer price) {
        Menu menu = new Menu(foodid, foodname, price);
        int result = menuService.updateByPrimaryKey(menu);
        if (result == 1) {
            return ResponseTool.success(menu);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping(value = "/op/menu/delete")
    public AjaxResult delete(String foodid) {
        int result=menuService.deleteByPrimaryKey(foodid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

    @RequestMapping(value = "/op/menu/select")
    public AjaxResult select(String foodid) {
        Menu menu= menuService.selectByPrimaryKey(foodid);
        if (menu!=null) {
            return ResponseTool.success(menu);
        } else {
            return ResponseTool.failed("找不到指定的食物");
        }
    }

    @RequestMapping(value = "/op/menu/show")
    public AjaxResult show(){
        List<Menu> list=menuService.selectAll();
        if (list != null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有食物");
        }
    }
}
