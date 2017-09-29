package com.gree.twms.service.impl;

import com.gree.twms.dao.UserMapper;
import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectIsValidUser(User user) {
//        User result = userMapper.selectIsValidUser(user);
        User result = userMapper.selectByPrimaryKey("1");
        return null;
    }
}
