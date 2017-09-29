package com.gree.twms.dao;

import com.gree.twms.pojo.Material;

public interface MaterialMapper {
    int insert(Material record);

    int insertSelective(Material record);
}