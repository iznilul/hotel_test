package com.anthotel.admin.dao;

import com.anthotel.admin.entity.HotelList;
import java.util.List;

public interface HotelListMapper {
    int deleteByPrimaryKey(String hotelid);

    int insert(HotelList record);

    HotelList selectByPrimaryKey(String hotelid);

    List<HotelList> selectAll();

    int updateByPrimaryKey(HotelList record);
}