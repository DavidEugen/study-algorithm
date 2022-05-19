package com.study.algorithm.tree;

public class PostOrder {
    /**
     * 주어진 이진 트리에서 후위탐색(왼쪽, 오른쪽, 루트 순서)시 n번째에 해당하는 값을 출력하라.
     */
    private int count = 0;

    void searchPostOrder(Node root, int index) { // 후위 탐색 좌 -> 우 -> 루트
        if (root != null) {
            searchPostOrder(root.left, index);
            searchPostOrder(root.right, index);

            if (count++ == index - 1) {
                System.out.println(root.data);
            }
        }
    }
}
