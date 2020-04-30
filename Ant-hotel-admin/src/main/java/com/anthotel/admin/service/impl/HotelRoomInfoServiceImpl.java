package com.anthotel.admin.service.impl;

import com.anthotel.admin.dao.HotelRoomInfoMapper;
import com.anthotel.admin.entity.HotelRoomInfo;
import com.anthotel.admin.service.HotelRoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HotelRoomInfoServiceImpl implements HotelRoomInfoService {
    @Autowired
    HotelRoomInfoMapper hotelRoomInfoMapper;

    public HotelRoomInfo selectByHotelId(String hotelid) {
        return hotelRoomInfoMapper.selectByHotelId(hotelid);
    }

    public List<HotelRoomInfo> selectAll() {
        return hotelRoomInfoMapper.selectAll();
    }

    public int updateCountReduce(String hotelid) {
        return hotelRoomInfoMapper.updateCountReduce(hotelid);
    }

    public int updateCountPlus(String hotelid) {
        return hotelRoomInfoMapper.updateCountPlus(hotelid);
    }

}
