//package com.anthotel.admin.service.impl;
//
//import com.anthotel.admin.dao.ReserveRecordMapper;
//import com.anthotel.admin.entity.ReserveRecord;
//import com.anthotel.admin.service.ReserveRecordService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ReserveRecordServiceImpl implements ReserveRecordService {
//    @Autowired
//    ReserveRecordMapper reserveRecordMapper;
//    @Override
//    public List<ReserveRecord> selectAll(){
//        return reserveRecordMapper.selectAll();
//    }
//
//    @Override
//    public int insert(ReserveRecord reserveRecord) {
//        return reserveRecordMapper.insert(reserveRecord);
//    }
//    @Override
//    public int delete(String reserveId){
//        return reserveRecordMapper.deleteByPrimaryKey(reserveId);
//    }
//
//    @Override
//    public int update(ReserveRecord reserveRecord) {
//        return reserveRecordMapper.updateByPrimaryKey(reserveRecord);
//    }
//    @Override
//    public ReserveRecord selectById(String reserveId){
//        return reserveRecordMapper.selectByPrimaryKey(reserveId);
//    }
//
//    public ReserveRecord selectLast() {
//        return reserveRecordMapper.selectLast();
//    }
//
//    public String selectRoomId(String reserveid) {
//        return reserveRecordMapper.selectRoomId(reserveid);
//    }
//}
