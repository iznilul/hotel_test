package com.anthotel.admin.dao;

import com.anthotel.admin.entity.HotelRoomInfo;
import java.util.List;

public interface HotelRoomInfoMapper {

    HotelRoomInfo selectByHotelId(String hotelid);

    List<HotelRoomInfo> selectAll();

    int updateCountReduce(String hotelid);

    int updateCountPlus(String hotelid);
}