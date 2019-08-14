package com.jiayuan.service;

import com.jiayuan.domain.RolePower;

import java.util.List;

/**
 * Created by LuoYJ on 2018/7/23.
 */
public interface RolePowerService {
    List<RolePower> selectPowerByRoleId(Integer rid);
}
