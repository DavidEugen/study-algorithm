package com.study.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {

    Map<Integer, Integer> indexMap;
    int preIndex = 0;

    static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.data);
            printInOrder(root.right);
        }
    }


    Node build(int[] inOrder, int[] preOrder) {
        indexMap = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            indexMap.put(inOrder[i], i);
        }
        return buildRecurse(inOrder, preOrder, 0, inOrder.length - 1);
    }

    private Node buildRecurse(int[] inOrder, int[] preOrder, int startIndex, int endIndex) {
        if (startIndex > endIndex)
            return null;

        Node node = new Node(preOrder[preIndex++]);

        if (startIndex == endIndex)
            return node;

        int inIndex = searchIndex(inOrder, startIndex, endIndex, node.data);

        node.left = buildRecurse(inOrder, preOrder, startIndex, inIndex - 1);
        node.right = buildRecurse(inOrder, preOrder, inIndex + 1, endIndex);
        return node;
    }

    private int searchIndex(int[] inOrder, int startIndex, int endIndex, int value) {
        for (int i = startIndex; i < endIndex + 1; i++) {
            if (inOrder[i] == value) {
                return i;
            }
        }
        return 0;
    }
}
