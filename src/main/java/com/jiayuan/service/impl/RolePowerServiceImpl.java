package com.jiayuan.service.impl;

import com.jiayuan.dao.RolePowerMapper;
import com.jiayuan.domain.RolePower;
import com.jiayuan.service.RolePowerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LuoYJ on 2018/7/23.
 */
@Service
public class RolePowerServiceImpl implements RolePowerService {

    @Resource
    private RolePowerMapper rolePowerMapper;

    public List<RolePower> selectPowerByRoleId(Integer rid) {
        List<RolePower> rolePowers = rolePowerMapper.selectPowerByRoleId(rid);
        return rolePowers;
    }
}
