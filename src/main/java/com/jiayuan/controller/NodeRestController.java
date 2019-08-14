package com.jiayuan.controller;

import com.jiayuan.domain.Node;
import com.jiayuan.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by YonJar on 2019/7/26.
 */
@RestController
public class NodeRestController {

    @Autowired
    private NodeService nodeService;

    public List<Node> getNodeTree(){
        return nodeService.getNodeTree();
    }

}
