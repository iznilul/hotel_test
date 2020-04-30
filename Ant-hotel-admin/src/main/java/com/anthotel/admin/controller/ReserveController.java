//package com.anthotel.admin.controller;
//
//
//import com.anthotel.admin.entity.ReserveRecord;
//import com.anthotel.admin.entity.RoomInfo;
//import com.anthotel.admin.response.AjaxResult;
//import com.anthotel.admin.response.ResponseTool;
//import com.anthotel.admin.service.ReserveRecordService;
//import com.anthotel.admin.service.RoomInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//@RestController
//public class ReserveController {
//    @Autowired
//    ReserveRecordService reserveRecordService;
//    @Autowired
//    RoomInfoService roomInfoService;
////    这里应该能看懂，
//    @RequestMapping(value = "/guest/showFree")
//    public AjaxResult showFree(){
//    List<RoomInfo> list = roomInfoService.selectFree();
//    if (list !=null) {
//    return ResponseTool.success(list);
//    } else {
//    return ResponseTool.failed("当前没有空余房间");
//    }
//    }
//    @RequestMapping(value = "/guest/reserve")
//    public AjaxResult ReserveInsert(String reserveid,String name, String phonenumber, String roomid) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        获得当前时间
//        String reserveTime = df.format(new Date());
//        ReserveRecord reserveRecord = new ReserveRecord(reserveid, name, phonenumber, roomid, reserveTime);
//        int result=(reserveRecordService.insert(reserveRecord))& (roomInfoService.updateStatue(roomid));
//        if (result == 1) {
//            return ResponseTool.success(reserveRecordService.selectLast().getReserveid());
//        } else {
//            return ResponseTool.failed("预约失败");
//        }
//    }
//    @RequestMapping(value = "/guest/deleteReserve")
//    public AjaxResult deleteReserve(String reserveid){
//        String roomid = reserveRecordService.selectRoomId(reserveid);
//        int result = (reserveRecordService.delete(reserveid))& (roomInfoService.updateBackStatue(roomid));
//        if (result == 1) {
//            return ResponseTool.success("删除订单成功");
//        } else {
//            return ResponseTool.failed("删除订单失败");
//        }
//    }
//    @RequestMapping(value = "/op/reserve/delete")
//    public AjaxResult delete(String reserveid){
//        int result = reserveRecordService.delete(reserveid);
//        if (result == 1) {
//            return ResponseTool.success("删除成功");
//        } else {
//            return ResponseTool.failed("删除失败");
//        }
//    }
//    @RequestMapping(value="/op/reserve/show")
//    public AjaxResult show(){
//        List<ReserveRecord> list=reserveRecordService.selectAll();
//        if (list != null) {
//            return ResponseTool.success(list);
//        } else {
//            return ResponseTool.failed("当前没有预约记录");
//        }
//    }
//
//    @RequestMapping(value="/op/reserve/select")
//    public AjaxResult select(String reserveid){
//        ReserveRecord reserveRecord=reserveRecordService.selectById(reserveid);
//        if (reserveRecord != null) {
//            return ResponseTool.success(reserveRecord);
//        } else {
//            return ResponseTool.failed("找不到指定预约记录");
//        }
//    }
//
//    @RequestMapping(value = "/op/reserve/update")
//    public AjaxResult update(String reserveid, String name, String phonenumber, String roomid){
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String reserveTime = df.format(new Date());
//        ReserveRecord reserveRecord = new ReserveRecord(reserveid, name, phonenumber, roomid, reserveTime);
//        int result = reserveRecordService.update(reserveRecord);
//        if (result == 1) {
//            return ResponseTool.success(reserveRecord);
//        } else {
//            return ResponseTool.failed("更新失败");
//        }
//    }
//}
