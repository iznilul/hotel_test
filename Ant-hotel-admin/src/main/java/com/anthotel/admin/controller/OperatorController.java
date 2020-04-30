package com.anthotel.admin.controller;

import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/op")
public class OperatorController {
    @RequestMapping(value = "")
    public AjaxResult login() {
        return ResponseTool.success("欢迎进入，您的身份是操作员");
    }
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public AjaxResult getMessage() {
        return ResponseTool.success("您拥有操作员权限，可以获得该接口的信息！");
    }
}
