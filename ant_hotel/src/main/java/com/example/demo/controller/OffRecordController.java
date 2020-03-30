package com.example.demo.controller;

import com.example.demo.entity.OffRecord;
import com.example.demo.entity.OnRecord;
import com.example.demo.service.OffRecordService;
import com.example.demo.service.OnRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/OffRecord")
public class OffRecordController {
    @Autowired
    OffRecordService offRecordService;
    //    这里应该能看懂
    @RequestMapping("/insert")
    public int insert(String userid, String name, String roomid) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //        获得当前时间
        String offtime = df.format(new Date());
        OffRecord offRecord = new OffRecord(userid, name, roomid, offtime);
        return offRecordService.insert(offRecord);
    }

    @RequestMapping("/show")
    public List<OffRecord> show() {
        return offRecordService.selectAll();
    }

    @RequestMapping("/update")
    public int update(String userid, String name, String roomid) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String offtime = df.format(new Date());
        OffRecord offRecord = new OffRecord(userid, name, roomid, offtime);
        return offRecordService.updateByPrimaryKey(offRecord);
    }

    @RequestMapping("/select")
    public List<OffRecord> select(String userid) {
        return offRecordService.selectByPrimaryKey(userid);
    }

    @RequestMapping("/delete")
    public int delete(String userid) {
        return offRecordService.deleteByPrimaryKey(userid);
    }
}

