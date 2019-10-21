package com.jiayuan.domain;

/**
 * Created by LuoYJ on 2018/7/20.
 */
public class User {
    private int id;
    private String uname;
    private int age;

    public User(int id, String uname, int age) {
        this.id = id;
        this.uname = uname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return uname;
    }

    public void setName(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
