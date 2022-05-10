package com.study.algorithm.tree;

public class Tree {
    Node root;

    //배열을 어디까지 읽었는지 가늠할 인텍스
    static int pIndex = 0;

    public void buildTreeByInPre(int in[], int pre[]) {
        pIndex = 0;
        root = buildTreeByInPre(in, pre, 0, in.length - 1);
    }

    private Node buildTreeByInPre(int in[], int pre[], int start, int end) {
        if (start > end) {
            return null;
        }

        Node node = new Node(pre[pIndex++]);
        if (start == end) {
            return node;
        }

        int mid = search(in, start, end, node.data);
        node.left = buildTreeByInPre(in, pre, start, mid - 1);
        node.right = buildTreeByInPre(in, pre, mid + 1, end);
        return node;

    }

    public void buildTreeByInPost(int in[], int post[]) {
        pIndex = post.length - 1;
        root = buildTreeByInPost(in, post, 0, in.length - 1);
    }

    private Node buildTreeByInPost(int[] in, int[] post, int start, int end) {
        if (start > end) {
            return null;
        }

        Node node = new Node(post[pIndex--]);
        if (start == end) {
            return node;
        }

        int mid = search(in, start, end, node.data);
        node.right = buildTreeByInPost(in, post, mid + 1, end);
        node.left = buildTreeByInPost(in, post, start, mid - 1);
        return node;
    }

    private int search(int[] in, int start, int end, int data) {
        int i;
        for (i = start; i <= end; i++) {
            if (in[i] == data) {
                return i;
            }
        }
        return i;
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

}
