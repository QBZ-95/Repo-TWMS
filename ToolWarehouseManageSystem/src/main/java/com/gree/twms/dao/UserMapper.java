package com.gree.twms.dao;

import com.gree.twms.pojo.User;

import org.springframework.stereotype.Component;

@Component("userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(String pid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}