package com.study.algorithm.tree;

public class TreeMaxDepth {

    /**
     * 주어진 이진 트리의 높이를 구하라
     */

    int getNodeDepth(Node root) { // 왼쪽 / 오른쪽 높이중 큰 높잉에 + 1

        if (root == null) {
            return 0;
        }

        int leftDepth = getNodeDepth(root.left);
        int rightDepth = getNodeDepth(root.right);

        if (leftDepth > rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
        }
    }
}
