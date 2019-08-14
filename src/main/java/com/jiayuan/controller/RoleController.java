package com.jiayuan.controller;

import com.jiayuan.domain.Power;
import com.jiayuan.service.RolePowerService;
import com.jiayuan.domain.RolePower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by LuoYJ on 2018/7/23.
 */
@RestController
public class RoleController {
    @Autowired
    private RolePowerService rolePowerService;

    @GetMapping(value = "/power/{rid}")
    public List<RolePower> selectPower(@PathVariable("rid") int rid){
        List<RolePower> rolePowers = rolePowerService.selectPowerByRoleId(rid);
        for (RolePower rolePower :
                rolePowers) {
            List<Power> power = rolePower.getPower();
            for (Power p :
                    power) {
                System.out.println(p.getPname());
            }
        }
        return rolePowers;
    }
}
