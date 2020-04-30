package com.anthotel.admin.service;

import com.anthotel.admin.dao.HotelRoomInfoMapper;
import com.anthotel.admin.entity.HotelRoomInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface HotelRoomInfoService {

    HotelRoomInfo selectByHotelId(String hotelid);

    List<HotelRoomInfo> selectAll();

    int updateCountReduce(String hotelid);

    int updateCountPlus(String hotelid);

}
