package com.example.demo.controller;


import com.example.demo.entity.ReserveRecord;
import com.example.demo.service.ReserveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {
    @Autowired
    ReserveRecordService reserveRecordService;
//    这里应该能看懂，
    @RequestMapping(method = RequestMethod.POST, value = "/insert")
    public int ReserveInsert(String name, String phonenumber, String roomtype) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        获得当前时间
        String reserveTime = df.format(new Date());
        Integer reserveId = null;
        ReserveRecord reserveRecord = new ReserveRecord(reserveId, name, phonenumber, roomtype, reserveTime);
        reserveRecordService.insert(reserveRecord);
        return reserveRecordService.selectLast().getReserveid();
    }

    @RequestMapping(value = "/delete")
    public int delete(Integer reserveId){
        int result = reserveRecordService.delete(reserveId);
        return result;
    }
    @RequestMapping(value="/show")
    public List<ReserveRecord> show(){
        return reserveRecordService.selectAll();
    }

    @RequestMapping(value="/select")
    public ReserveRecord select(Integer reserveid){
        return reserveRecordService.selectById(reserveid);
    }

    @RequestMapping(value = "/update")
    public int update(Integer reserveid, String name, String phonenumber, String roomtype){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String reserveTime = df.format(new Date());
        ReserveRecord reserveRecord = new ReserveRecord(reserveid, name, phonenumber, roomtype, reserveTime);
        int result = reserveRecordService.update(reserveRecord);
        return result;
    }
}
