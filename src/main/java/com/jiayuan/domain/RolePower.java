package com.jiayuan.domain;

import java.util.List;

public class RolePower {
    private Integer id;

    private Integer rId;

    private Integer pId;

    //手动添加
    private Role role;

    private List<Power> power;

    public List<Power> getPower() {
        return power;
    }

    public void setPower(List<Power> power) {
        this.power = power;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public RolePower() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    @Override
    public String toString() {
        return "RolePower{" +
                "id=" + id +
                ", rId=" + rId +
                ", pId=" + pId +
                ", role=" + role +
                ", power=" + power +
                '}';
    }
}