package com.echounion.mc.modules.sys.dao;

import com.echounion.mc.modules.sys.entity.user;

public interface userMapper {
    int deleteByPrimaryKey(String id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}