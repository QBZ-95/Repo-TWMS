package com.gree.twms.dao;

import com.gree.twms.pojo.Review;

public interface ReviewMapper {
    int insert(Review record);

    int insertSelective(Review record);
}