package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.CheckInMapper;
import com.anthotel.admin.entity.CheckIn;
import com.anthotel.admin.service.CheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckInServiceImpl implements CheckInService {

    @Autowired
    private CheckInMapper checkInMapper;

    @Override
    public int insert(CheckIn checkIn) {
        return checkInMapper.insert(checkIn);
    }

    @Override
    public CheckIn selectById(String checkInId) {
        return checkInMapper.selectByPrimaryKey(checkInId);
    }

    @Override
    public List<CheckIn> selectAll() {
        return checkInMapper.selectAll();
    }

    @Override
    public int delete(String checkInId) {
        return checkInMapper.deleteByPrimaryKey(checkInId);
    }

    @Override
    public int update(CheckIn checkIn) {
        return checkInMapper.updateByPrimaryKey(checkIn);
    }
}
