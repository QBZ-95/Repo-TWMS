package com.gree.twms.dao;

import com.gree.twms.pojo.Tool;

public interface ToolMapper {
    int deleteByPrimaryKey(String tid);

    int insert(Tool record);

    int insertSelective(Tool record);

    Tool selectByPrimaryKey(String tid);

    int updateByPrimaryKeySelective(Tool record);

    int updateByPrimaryKey(Tool record);
}