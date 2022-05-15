package com.study.algorithm.tree;

public class PostOrder {
    private int count = 0;

    void print(Node root, int index) {
        if (root != null) {
            print(root.left, index);
            print(root.right, index);

            if (count++ == index - 1) {
                System.out.println(root.data);
            }
        }
    }
}
