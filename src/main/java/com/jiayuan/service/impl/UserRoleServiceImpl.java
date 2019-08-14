package com.jiayuan.service.impl;

import com.jiayuan.dao.UserRoleMapper;
import com.jiayuan.domain.UserRole;
import com.jiayuan.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LuoYJ on 2018/7/20.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    public UserRole selectUserDetailed(int uid) {
        return userRoleMapper.selectDetailed(uid);
    }
}
