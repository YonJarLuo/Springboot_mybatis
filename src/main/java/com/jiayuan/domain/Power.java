package com.jiayuan.domain;

/**
 * Created by LuoYJ on 2018/7/23.
 */
public class Power {
    private int id;
    private String pname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Power{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                '}';
    }
}
