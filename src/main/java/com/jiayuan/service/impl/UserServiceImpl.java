package com.jiayuan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiayuan.dao.UserDao;
import com.jiayuan.domain.User;
import com.jiayuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YonJar on 2019/8/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Object findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> allUser = userDao.findAllUser();
        PageInfo<User> pageInfo = new PageInfo<User>(allUser);
        return pageInfo;
    }
}
