package com.jiayuan.service.impl;

import com.jiayuan.dao.NodeDao;
import com.jiayuan.domain.Node;
import com.jiayuan.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YonJar on 2019/7/26.
 */
@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    private NodeDao nodeDao;

    public List<Node> getNodeTree() {

        return nodeDao.getNodeTree();
    }
}
