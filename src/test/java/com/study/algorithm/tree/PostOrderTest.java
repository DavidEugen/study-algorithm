package com.study.algorithm.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PostOrderTest {

    @Test
    @DisplayName("PostOrder 기본")
    void postOrderTest() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        PostOrder postOrder = new PostOrder();
        postOrder.print(root, 4);
    }


}