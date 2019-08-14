package com.jiayuan.domain;

import java.util.List;

/**
 * Created by YonJar on 2019/7/25.
 */
public class Node {
    //编号
    private Long id;
    //名称
    private String name;
    //下一个节点
    private List<Node> next;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getNext() {
        return next;
    }

    public void setNext(List<Node> next) {
        this.next = next;
    }
}
