package com.gree.twms.dao;

import com.gree.twms.pojo.Repair;

public interface RepairMapper {
    int insert(Repair record);

    int insertSelective(Repair record);
}