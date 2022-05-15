package com.study.algorithm.tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TreeMaxDepthTest {

    @Test
    @DisplayName("TreeMaxDepth")
    void treeMaxDepth() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        TreeMaxDepth treeMaxDepth = new TreeMaxDepth();
        System.out.println(treeMaxDepth.solution(root));

    }

}