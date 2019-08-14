package com.jiayuan.dao;

import com.jiayuan.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YonJar on 2019/8/14.
 */
@Repository
public interface UserDao {
    List<User> findAllUser();

}
