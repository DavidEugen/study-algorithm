package com.study.algorithm.queue;

import static org.assertj.core.api.Assertions.assertThat;

import com.study.algorithm.queue.TreeLayerSum.BFSNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TreeLayerSumTest {

    @Test
    @DisplayName("BFS(Breadth-First Search) Test")
    void treeLayerSumTest() {

        //given
        BFSNode root = new BFSNode(1);
        root.left = new BFSNode(2);
        root.right = new BFSNode(3);
        root.left.left = new BFSNode(4);
        root.left.right = new BFSNode(5);
        root.right.left = new BFSNode(6);

        TreeLayerSum treeLayerSum = new TreeLayerSum();

        //when//then
        assertThat(treeLayerSum.maxSum(root)).isEqualTo(15);

    }

}