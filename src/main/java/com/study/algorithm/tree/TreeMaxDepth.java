package com.study.algorithm.tree;

public class TreeMaxDepth {

    int solution(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = solution(root.left);
        int rightDepth = solution(root.right);

        if (leftDepth  > rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
        }
    }
}
