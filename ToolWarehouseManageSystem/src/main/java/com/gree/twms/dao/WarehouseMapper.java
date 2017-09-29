package com.gree.twms.dao;

import com.gree.twms.pojo.Warehouse;

public interface WarehouseMapper {
    int deleteByPrimaryKey(String sid);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}