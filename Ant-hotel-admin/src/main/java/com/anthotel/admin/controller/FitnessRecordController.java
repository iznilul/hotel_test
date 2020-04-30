package com.anthotel.admin.controller;

import com.anthotel.admin.entity.CheckIn;
import com.anthotel.admin.entity.FitnessRecord;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.CheckInService;
import com.anthotel.admin.service.FitnessRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class FitnessRecordController {
    @Autowired
    FitnessRecordService fitnessRecordService;
    //    增删改减
    @Autowired
    CheckInService checkInService;
    @RequestMapping("/user/fitness")
    public AjaxResult insert(String fitnesstype, HttpServletRequest request) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String ontime = df.format(new Date());
        Date ontime = new Date();
        HttpSession session = request.getSession();
        String userid = (String)session.getAttribute("id");
        CheckIn checkIn = checkInService.selectById(userid);
        String name = checkIn.getName();
        FitnessRecord fitnessRecord = new FitnessRecord(userid, name, fitnesstype,ontime);
        int result = fitnessRecordService.insert(fitnessRecord);
        if (result == 1) {
            return ResponseTool.success(fitnessRecord);
        } else {
            return ResponseTool.failed("添加健身记录失败");
        }
    }

    @RequestMapping(value = "/op/fitness/update")
    public AjaxResult update(String userid, String name, String fitnesstype) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String ontime = df.format(new Date());
        Date ontime = new Date();
        FitnessRecord fitnessRecord = new FitnessRecord(userid, name, fitnesstype, ontime);
        int result = fitnessRecordService.updateByPrimaryKey(fitnessRecord);
        if (result == 1) {
            return ResponseTool.success(fitnesstype);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping("/op/fitness/delete")
    public AjaxResult delete(String userid) {
        int result = fitnessRecordService.deleteByPrimaryKey(userid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

    @RequestMapping("/op/fitness/show")
    public AjaxResult show() {
        List<FitnessRecord> list = fitnessRecordService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有健身记录");
        }
    }

    @RequestMapping("/op/fitness/select")
    public AjaxResult select(String userid) {
        List<FitnessRecord> list = fitnessRecordService.selectByPrimaryKey(userid);
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("找不到指定人员的健身记录");
        }
    }
}
