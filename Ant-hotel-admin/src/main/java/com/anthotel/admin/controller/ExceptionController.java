package com.anthotel.admin.controller;

import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import org.apache.shiro.authc.AccountException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    // 捕捉 CustomRealm 抛出的异常
    @ExceptionHandler(AccountException.class)
    public AjaxResult handleShiroException(Exception ex) {
        return ResponseTool.failed(ex.getMessage());
    }
}
