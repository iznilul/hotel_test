package com.example.demo.service.impl;

import com.example.demo.dao.CheckOutMapper;
import com.example.demo.entity.CheckIn;
import com.example.demo.entity.CheckOut;
import com.example.demo.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckOutServiceImpl implements CheckOutService {
    @Autowired
    CheckOutMapper checkOutMapper;

    public int insert(CheckOut checkOut) {
        return checkOutMapper.insert(checkOut);
    }

    public int deleteByPrimaryKey(String userid) {
        return checkOutMapper.deleteByPrimaryKey(userid);
    }

    public CheckOut selectByPrimaryKey(String userid) {
        return checkOutMapper.selectByPrimaryKey(userid);
    }

    public List<CheckOut> selectAll() {
        return checkOutMapper.selectAll();
    }

    public int updateByPrimaryKey(CheckOut record) {
        return checkOutMapper.updateByPrimaryKey(record);
    }
}
