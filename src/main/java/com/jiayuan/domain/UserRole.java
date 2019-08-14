package com.jiayuan.domain;

public class UserRole {
    private Integer id;

    private Integer uId;

    private Integer rId;

    //手动添加
    private User user;
    private Role role;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", uId=" + uId +
                ", rId=" + rId +
                ", user=" + user +
                ", role=" + role +
                '}';
    }
}