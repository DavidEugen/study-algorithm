package com.study.algorithm.tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TreeIntroTest {

    @Test
    @DisplayName("트리 기본")
    void treeIntroTest() {
        //givne
        Node root = new Node(1);
        //when
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //when
        TreeIntro treeIntro = new TreeIntro();
        treeIntro.ldr1(root);

    }

}