package com.jiayuan.domain;

import java.util.List;

/**
 * Created by YonJar on 2019/7/25.
 */

public class Node {
    //编号
    private int id;
    //名称
    private String name;
    //父节点ID
    private int parentId;
    //下一个节点
    private List<Node> next;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List<Node> getNext() {
        return next;
    }

    public void setNext(List<Node> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                ", next=" + next +
                '}';
    }
}
