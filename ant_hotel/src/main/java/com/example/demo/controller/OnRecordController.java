package com.example.demo.controller;


import com.example.demo.entity.OnRecord;
import com.example.demo.service.OnRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/OnRecord")
public class OnRecordController {
    @Autowired
    OnRecordService onRecordService;
    //    这里应该能看懂
    @RequestMapping("/insert")
    public int insert(String userid, String name, String roomid) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //        获得当前时间
        String ontime = df.format(new Date());
        OnRecord onRecord = new OnRecord(userid, name, roomid, ontime);
        return onRecordService.insert(onRecord);
    }

    @RequestMapping("/show")
    public List<OnRecord> show() {
        return onRecordService.selectAll();
    }

    @RequestMapping("/update")
    public int update(String userid, String name, String roomid) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ontime = df.format(new Date());
        OnRecord onRecord = new OnRecord(userid, name, roomid, ontime);
        return onRecordService.updateByPrimaryKey(onRecord);
    }

    @RequestMapping("/select")
    public List<OnRecord> select(String userid) {
        return onRecordService.selectByPrimaryKey(userid);
    }

    @RequestMapping("/delete")
    public int delete(String userid) {
        return onRecordService.deleteByPrimaryKey(userid);
    }
}
