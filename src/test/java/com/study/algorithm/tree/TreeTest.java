package com.study.algorithm.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TreeTest {

    @Test
    @DisplayName("Tree Test")
    void treeTest() {
        // given
        Tree tree = new Tree();
        //when
        int[] pre = {4, 2, 1, 3, 6, 5, 7};
        int[] in = {1, 2, 3, 4, 5, 6, 7};
        int[] post = {1, 3, 2, 5, 7, 6, 4};

        //then
        tree.buildTreeByInPre(in, pre);
        tree.printInorder(tree.root);
        System.out.println(" ");
        tree.buildTreeByInPost(in, post);
        tree.printInorder(tree.root);

    }
}