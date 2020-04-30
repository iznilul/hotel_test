package com.anthotel.admin.dao;

import com.anthotel.admin.entity.Admin;
import java.util.List;

public interface AdminMapper {
    int insert(Admin record);

    List<Admin> selectAll();
}