package com.study.algorithm.tree;

public class FindLCASolution3 {
    Node solution(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        int value = root.data;
        if (value < n1 && value < n2) {
            return solution(root.right, n1, n2);
        }

        if (value > n1 && value > n2) {
            return solution(root.left, n1, n2);
        }

        return root;
    }
}
