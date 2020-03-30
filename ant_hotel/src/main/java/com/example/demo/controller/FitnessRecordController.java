package com.example.demo.controller;

import com.example.demo.entity.FitnessRecord;
import com.example.demo.service.FitnessRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/FitnessRecord")
public class FitnessRecordController {
    @Autowired
    FitnessRecordService fitnessRecordService;
//    增删改减
    @RequestMapping("/insert")
    public int insert(String userid, String name, String fitnesstype) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ontime = df.format(new Date());
        FitnessRecord fitnessRecord = new FitnessRecord(userid, name, fitnesstype,ontime);
        return fitnessRecordService.insert(fitnessRecord);
    }

    @RequestMapping(value = "/update")
    public int update(String userid, String name, String fitnesstype) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ontime = df.format(new Date());
        FitnessRecord fitnessRecord = new FitnessRecord(userid, name, fitnesstype, ontime);
        return fitnessRecordService.updateByPrimaryKey(fitnessRecord);
    }

    @RequestMapping("/delete")
    public int delete(String userid) {
        return fitnessRecordService.deleteByPrimaryKey(userid);
    }

    @RequestMapping("/show")
    public List<FitnessRecord> show() {
        return fitnessRecordService.selectAll();
    }

    @RequestMapping("/select")
    public List<FitnessRecord> select(String userid) {
        return fitnessRecordService.selectByPrimaryKey(userid);
    }
}
