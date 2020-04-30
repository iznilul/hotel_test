package com.anthotel.admin.controller;


import com.anthotel.admin.entity.RoomLiveRecord;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.RoomLiveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class RoomLiveRecordController {
    @Autowired
    RoomLiveRecordService roomLiveRecordService;
    @RequestMapping("/op/roomLive/insert")
    public AjaxResult insert( String userid,
             String name,
             Date signtime,
             Date leavetime,
             String roomid,
             BigDecimal cost) {
        RoomLiveRecord roomLiveRecord = new RoomLiveRecord(userid, name, signtime, leavetime, roomid, cost);
        int result = roomLiveRecordService.insert(roomLiveRecord);
        if (result == 1) {
            return ResponseTool.success(roomLiveRecord);
        } else {
            return ResponseTool.failed("添加住宿记录失败");
        }
    }

    @RequestMapping("/op/roomLive/show")
    public AjaxResult show() {
        List<RoomLiveRecord> list = roomLiveRecordService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有住宿记录");
        }
    }

    @RequestMapping("/op/roomLive/update")
    public AjaxResult update(String userid,
                             String name,
                             Date signtime,
                             Date leavetime,
                             String roomid,
                             BigDecimal cost) {
        RoomLiveRecord roomLiveRecord = new RoomLiveRecord(userid, name, signtime, leavetime, roomid, cost);
        int result = roomLiveRecordService.updateByPrimaryKey(roomLiveRecord);
        if (result == 1) {
            return ResponseTool.success(roomLiveRecord);
        } else {
            return ResponseTool.failed("更新住宿记录失败");
        }
    }

    @RequestMapping("/op/roomLive/delete")
    public AjaxResult delete(String userid){
        int result = roomLiveRecordService.deleteByPrimaryKey(userid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

    @RequestMapping("/op/roomLive/select")
    public AjaxResult select(String userid) {
        RoomLiveRecord roomLiveRecord = roomLiveRecordService.selectByPrimaryKey(userid);
        if (roomLiveRecord !=null) {
            return ResponseTool.success(roomLiveRecord);
        } else {
            return ResponseTool.failed("找不到指定用户的住宿记录");
        }
    }
}
