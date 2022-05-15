package com.study.algorithm.tree;

import java.util.Stack;

public class TreeIntro {

    public void ldr1(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();

        while(true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            if (stack.isEmpty()) {
                break;
            }

            root = stack.pop();
            System.out.println(root.data);
            root = root.right;
        }
    }
}
