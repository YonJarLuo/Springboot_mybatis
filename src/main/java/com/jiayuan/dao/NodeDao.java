package com.jiayuan.dao;

import com.jiayuan.domain.Node;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YonJar on 2019/7/26.
 */
@Repository
public interface NodeDao {
    List<Node> getNodeTree();
}
