package com.gree.twms.dao;

import com.gree.twms.pojo.Version;

public interface VersionMapper {
    int insert(Version record);

    int insertSelective(Version record);
}