package com.jiayuan.service.impl;

import com.jiayuan.dao.NodeDao;
import com.jiayuan.domain.Node;
import com.jiayuan.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by YonJar on 2019/7/26.
 * 使用jdk1.8的新特性，可以提高性能。递归去查数据库，增加了数据库连接的开销
 */
@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    private NodeDao nodeDao;

    public List<Node> getNodeTree() {
        List<Node> allTree = nodeDao.getNodeTree();
        //过滤出顶级目录
        List<Node> fNode = allTree.stream().filter(a -> a.getParentId() == 0).collect(Collectors.toList());
        fNode.forEach(f -> getChildNodeTree(f,allTree));
        return fNode;
    }

    /**
     * 递归遍历
     */
    public void getChildNodeTree(Node node,List<Node> all){
        List<Node> collect = all.stream().filter(a -> a.getParentId() == node.getId()).collect(Collectors.toList());
        if (collect != null && collect.size() > 0){
            node.setNext(collect);
            for (Node n : collect) {
                getChildNodeTree(n,all);
            }
        }
    }
}
