package com.anthotel.admin.controller;

import com.anthotel.admin.entity.Login;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

//    #小程序用户登陆接口
    @PostMapping("/userLogin")
    public AjaxResult mini_Login(@Param("openid") String openid,HttpServletRequest request) {
        System.out.println("登陆用户的openid为：" + openid);//此处也可以得到session_key的值
        Login login = loginService.selectByPrimaryKey(openid);//去数据库判断用户是否存在该用户
        if (login != null)//如果存在该用户
        {
            String name = login.getName();
            String password = login.getPassword();
            return adminLogin(name, password,request);
        }else {
            //如果是新用户，就转向到人脸识别界面
//            String password = "123";
//            String name = "test";
//            Login l = new Login(openid, name, password,"user");
//            loginService.insert(l);
            return ResponseTool.failed("没有这个用户");
        }
    }
//    #管理员登陆接口
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult adminLogin(String username, String password,HttpServletRequest request) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        Login login = loginService.selectByName(username);
        HttpSession session = request.getSession();
        session.setAttribute("sessionId", session.getId());
        session.setAttribute("id", login.getId());
        HashMap map = new HashMap<>();
        map.put("sessionId", session.getId());
        map.put("id", login.getId());
        if ("operator".equals(login.getRole())) {
            return ResponseTool.success(map);
        }
        if ("admin".equals(login.getRole())) {
            return ResponseTool.success(map);
        }
        if ("user".equals(login.getRole())) {
            return ResponseTool.success(map);
        }
        return ResponseTool.failed("权限错误！");
    }

    @RequestMapping(value = "/notLogin", method = RequestMethod.GET)
    public AjaxResult notLogin() {
        return ResponseTool.failed("您尚未登陆！");

    }

    @RequestMapping(value = "/notRole", method = RequestMethod.GET)
    public AjaxResult notRole() {
        return ResponseTool.failed("您没有权限！");
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public AjaxResult logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return ResponseTool.success("成功注销");
    }

    @RequestMapping("/admin/register")
    public AjaxResult register(String id,String name, String password,String role) {
        if (name == null)
            return ResponseTool.failed("用户名不得为空");
        else if (password == null) {
            return ResponseTool.failed("密码不得为空");
        }
        Login login = new Login(id, name, password,role);
        int result = loginService.insert(login);
        if (result == 1) {
            return ResponseTool.success(result);
        } else
            return ResponseTool.failed("注册失败，请稍后重试");
    }

    @RequestMapping("/admin/show")
    public AjaxResult show() {
        List<Login> list = loginService.selectAll();
        if (list != null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有用户");
        }
    }

    @RequestMapping("/admin/select")
    public AjaxResult select(String id) {
        Login Login = loginService.selectByPrimaryKey(id);
        if (Login != null) {
            return ResponseTool.success(Login);
        } else {
            return ResponseTool.failed("没这个用户");
        }
    }

    @RequestMapping("/admin/update")
    public AjaxResult update(String id,String name, String password,String role, HttpServletRequest request) {
        HttpSession session = request.getSession();
//        String id = (String) session.getAttribute("LoginId");
        Login login = new Login(id, name, password,role);
        int result = loginService.updateByPrimaryKey(login);
        if (result == 1) {
            return ResponseTool.success(login);
        } else {
            return ResponseTool.failed("修改失败");
        }
    }
    @RequestMapping("/admin/delete")
    public AjaxResult delete(String id,HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        String id = (String) session.getAttribute("id");
        int result = loginService.deleteByPrimaryKey(id);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }
}
