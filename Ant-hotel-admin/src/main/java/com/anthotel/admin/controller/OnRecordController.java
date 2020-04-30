package com.anthotel.admin.controller;


import com.anthotel.admin.entity.CheckIn;
import com.anthotel.admin.entity.OnRecord;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.CheckInService;
import com.anthotel.admin.service.OnRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class OnRecordController {
    @Autowired
    OnRecordService onRecordService;
    @Autowired
    CheckInService checkInService;
    //    这里应该能看懂
    @RequestMapping("/user/on")
    public AjaxResult insert(HttpServletRequest request) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //        获得当前时间
//        String ontime = df.format(new Date());
        Date ontime = new Date();
        HttpSession session = request.getSession();
        String userid = (String)session.getAttribute("id");
        CheckIn checkIn = checkInService.selectById(userid);
        String name = checkIn.getName();
        String roomid = checkIn.getRoomid();
        OnRecord onRecord = new OnRecord(userid, name, roomid, ontime);
        int result= onRecordService.insert(onRecord);
        if (result == 1) {
            return ResponseTool.success(onRecord);
        } else {
            return ResponseTool.failed("添加进门记录失败");
        }
    }

    @RequestMapping("/op/on/show")
    public AjaxResult show() {

        List<OnRecord> list= onRecordService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有进门记录");
        }
    }

    @RequestMapping("/op/on/update")
    public AjaxResult update(String userid, String name, String roomid) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String ontime = df.format(new Date());
        Date ontime = new Date();
        OnRecord onRecord = new OnRecord(userid, name, roomid, ontime);
        int result=onRecordService.updateByPrimaryKey(onRecord);
        if (result == 1) {
            return ResponseTool.success(onRecord);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping("/op/on/select")
    public AjaxResult select(String userid) {

        List<OnRecord> list = onRecordService.selectByPrimaryKey(userid);
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("找不到指定人员的进门记录");
        }
    }

    @RequestMapping("/op/on/delete")
    public AjaxResult delete(String userid) {

        int result = onRecordService.deleteByPrimaryKey(userid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }
}
