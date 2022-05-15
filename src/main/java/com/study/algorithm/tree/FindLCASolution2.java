package com.study.algorithm.tree;

public class FindLCASolution2 {
    Node solution(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = solution(root.left, n1, n2);
        Node rightLCA = solution(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }
}
