package com.study.algorithm.tree;

public class ValidateBST {
    boolean solution(Node node) {
        if (node == null) {
            return true;
        }

        if (node.left != null && node.left.data > node.data) {
            return false;
        }

        if (node.right != null && node.right.data < node.data) {
            return false;
        }

        if (!solution(node.left) || !solution(node.right)) {
            return false;
        }

        return true;
    }

    boolean solution2(Node node) {
        return isValid(node, null, null);
    }

    private boolean isValid(Node node, Node left, Node right) {
        if (node == null) {
            return true;
        }

        if (left != null && node.data <= left.data) {
            return false;
        }

        if (right != null && node.data >= right.data) {
            return false;
        }

        return isValid(node.left, left, node) &&
                isValid(node.right, node, right);
    }

    private Node prevNode;
    boolean solution3(Node node) {
        if (node != null) {
            if (!solution(node.left)) {
                return false;
            }

            if (prevNode != null && node.data <= prevNode.data) {
                return false;
            }

            prevNode = node;
            return solution(node.right);
        }

        return true;
    }
}
