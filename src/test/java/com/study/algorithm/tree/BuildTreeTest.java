package com.study.algorithm.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuildTreeTest {

    @Test
    @DisplayName("BuildTreeTest")
    void buildTreeTest() {
        BuildTree buildTree = new BuildTree();
        Node root = buildTree.build(new int[]{4, 2, 5, 1, 6, 3}, new int[]{1, 2, 4, 5, 3, 6});
        buildTree.printInOrder(root);
    }

}