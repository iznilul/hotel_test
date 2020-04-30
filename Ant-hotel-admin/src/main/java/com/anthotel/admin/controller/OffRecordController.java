package com.anthotel.admin.controller;

import com.anthotel.admin.entity.CheckIn;
import com.anthotel.admin.entity.OffRecord;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.CheckInService;
import com.anthotel.admin.service.OffRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class OffRecordController {
    @Autowired
    OffRecordService offRecordService;
    @Autowired
    CheckInService checkInService;
    //    这里应该能看懂
    @RequestMapping("/user/off")
    public AjaxResult insert(HttpServletRequest request) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //        获得当前时间
//        String offtime = df.format(new Date());
        Date offtime = new Date();
        HttpSession session = request.getSession();
        String userid = (String)session.getAttribute("id");
        CheckIn checkIn = checkInService.selectById(userid);
        String name = checkIn.getName();
        String roomid = checkIn.getRoomid();
        OffRecord offRecord = new OffRecord(userid, name, roomid, offtime);
        int result = offRecordService.insert(offRecord);
        if (result == 1) {
            return ResponseTool.success(offRecord);
        } else {
            return ResponseTool.failed("添加出门记录失败");
        }
    }

    @RequestMapping("/op/off/show")
    public AjaxResult show() {

        List<OffRecord> list = offRecordService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有出门记录");
        }
    }

    @RequestMapping("/op/off/update")
    public AjaxResult update(String userid, String name, String roomid) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String offtime = df.format(new Date());
        Date offtime = new Date();
        OffRecord offRecord = new OffRecord(userid, name, roomid, offtime);
        int result = offRecordService.updateByPrimaryKey(offRecord);
        if (result == 1) {
            return ResponseTool.success(offRecord);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping("/op/off/select")
    public AjaxResult select(String userid) {
        List<OffRecord> list = offRecordService.selectByPrimaryKey(userid);
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("找不到指定人员的出门记录");
        }
    }

    @RequestMapping("/op/off/delete")
    public AjaxResult delete(String userid) {

        int result = offRecordService.deleteByPrimaryKey(userid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }
}

