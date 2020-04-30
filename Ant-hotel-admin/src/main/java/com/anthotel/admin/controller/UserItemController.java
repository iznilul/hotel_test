package com.anthotel.admin.controller;


import com.anthotel.admin.entity.UserItem;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.UserItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserItemController {
    @Autowired
    UserItemService userItemService;
    @RequestMapping("/op/userItem/insert")
    public AjaxResult insert(String userid,
                             String name,
                             String roomid,
                             Boolean roomcard,
                             Boolean key,
                             Integer coupon1,
                             Integer coupon2,
                             Integer coupon3) {
        UserItem userItem = new UserItem(userid, name, roomid, roomcard, key, coupon1, coupon2, coupon3);
        int result = userItemService.insert(userItem);
        if (result == 1) {
            return ResponseTool.success(userItem);
        } else {
            return ResponseTool.failed("添加用户状态失败");
        }
    }

    @RequestMapping("/op/userItem/show")
    public AjaxResult show() {
        List<UserItem> list = userItemService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有用户");
        }
    }

    @RequestMapping("/op/userItem/update")
    public AjaxResult update(String userid,
                             String name,
                             String roomid,
                             Boolean roomcard,
                             Boolean key,
                             Integer coupon1,
                             Integer coupon2,
                             Integer coupon3) {
        UserItem userItem = new UserItem(userid, name, roomid, roomcard, key, coupon1, coupon2, coupon3);
        int result = userItemService.insert(userItem);
        if (result == 1) {
            return ResponseTool.success(userItem);
        } else {
            return ResponseTool.failed("更新用户状态失败");
        }
    }

    @RequestMapping("/op/userItem/delete")
    public AjaxResult delete(String couponid){
        int result = userItemService.deleteByPrimaryKey(couponid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

    @RequestMapping("/op/userItem/select")
    public AjaxResult select(String userid) {
        UserItem userItem = userItemService.selectByPrimaryKey(userid);
        if (userItem !=null) {
            return ResponseTool.success(userItem);
        } else {
            return ResponseTool.failed("找不到指定的用户");
        }
    }
}
