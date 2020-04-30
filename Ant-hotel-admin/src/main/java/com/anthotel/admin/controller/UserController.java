package com.anthotel.admin.controller;

import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "")
    public AjaxResult login() {
        return ResponseTool.success("欢迎进入，您的身份是用户");
    }
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public AjaxResult getMessage() {
        return ResponseTool.success("您拥有用户权限，可以获得该接口的信息！");
    }
}
