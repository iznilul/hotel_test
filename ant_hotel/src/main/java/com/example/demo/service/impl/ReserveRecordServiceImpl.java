package com.example.demo.service.impl;

import com.example.demo.dao.ReserveRecordMapper;
import com.example.demo.entity.ReserveRecord;
import com.example.demo.service.ReserveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveRecordServiceImpl implements ReserveRecordService {
    @Autowired
    ReserveRecordMapper reserveRecordMapper;
    @Override
    public List<ReserveRecord> selectAll(){
        return reserveRecordMapper.selectAll();
    }

    @Override
    public int insert(ReserveRecord reserveRecord) {
        return reserveRecordMapper.insert(reserveRecord);
    }
    @Override
    public int delete(Integer reserveId){
        return reserveRecordMapper.deleteByPrimaryKey(reserveId);
    }

    @Override
    public int update(ReserveRecord reserveRecord) {
        return reserveRecordMapper.updateByPrimaryKey(reserveRecord);
    }
    @Override
    public ReserveRecord selectById(Integer reserveId){
        return reserveRecordMapper.selectByPrimaryKey(reserveId);
    }

    public ReserveRecord selectLast() {
        return reserveRecordMapper.selectLast();
    }
}
