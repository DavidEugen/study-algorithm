package com.study.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class FindLCASolution1 {

    Node solution(Node root, int n1, int n2) {
        List<Node> n1Path = new ArrayList<>();
        List<Node> n2Path = new ArrayList<>();
        if (!findPath(root, n1, n1Path) || !findPath(root, n2, n2Path)) {
            return null;
        }

        int index = 0;
        for (; index < n1Path.size() && index < n2Path.size(); index++) {
            if (!n1Path.get(index).equals(n2Path.get(index))) {
                break;
            }
        }

        return n1Path.get(index - 1);
    }

    private boolean findPath(Node root, int n, List<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (findPath(root.left, n, path)) {
            return true;
        }

        if (findPath(root.right, n, path)) {
            return true;
        }

        path.remove(root);
        return false;
    }
}
