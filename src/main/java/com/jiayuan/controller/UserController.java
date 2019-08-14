package com.jiayuan.controller;

import com.jiayuan.service.UserRoleService;
import com.jiayuan.domain.UserRole;
import com.jiayuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LuoYJ on 2018/7/20.
 */
@RestController
public class UserController {

    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private UserService userService;

    @GetMapping("/findAllUser")
    public Object findAllUser(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

    @GetMapping(value = "/detailed/{uid}")
    public UserRole selectDetailed(@PathVariable("uid") int uid){
        System.out.println("----------------");
        UserRole userRole = userRoleService.selectUserDetailed(uid);
        return userRole;
    }
}
