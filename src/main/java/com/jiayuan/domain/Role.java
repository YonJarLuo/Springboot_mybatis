package com.jiayuan.domain;

/**
 * Created by LuoYJ on 2018/7/20.
 */
public class Role {
    private Integer id;
    private String rname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return rname;
    }

    public void setName(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rname='" + rname + '\'' +
                '}';
    }
}
