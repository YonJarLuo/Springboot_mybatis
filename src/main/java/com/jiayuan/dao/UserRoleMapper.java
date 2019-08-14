package com.jiayuan.dao;

import com.jiayuan.domain.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

    //手动添加，关联查询（根据用户id，查找此用户的角色）
    UserRole selectDetailed(int uid);
}