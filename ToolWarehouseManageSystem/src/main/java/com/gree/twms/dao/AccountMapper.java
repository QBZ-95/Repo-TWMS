package com.gree.twms.dao;

import com.gree.twms.pojo.Account;

public interface AccountMapper {
    int insert(Account record);

    int insertSelective(Account record);
}