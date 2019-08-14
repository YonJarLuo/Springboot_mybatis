package com.jiayuan.dao;

import com.jiayuan.domain.RolePower;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePower record);

    int insertSelective(RolePower record);

    RolePower selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePower record);

    int updateByPrimaryKey(RolePower record);

    //手动添加
//    List<RolePower> selectPowerByRoleId(@Param("rid") Integer rid);
    List<RolePower> selectPowerByRoleId(Integer rid);
}