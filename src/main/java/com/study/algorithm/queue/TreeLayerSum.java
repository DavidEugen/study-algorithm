package com.study.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLayerSum {

    static class BFSNode {
        int value;
        BFSNode left, right;

        public BFSNode(int value) {
            this.value = value;
        }
    }

    /**
     * 바이너리 트리의 계층별 합계 중에 최대 값을 구하라.
     *        9  -> 9
     *       2 3  -> 5
     *      1 5 4  -> 10
     *      ==========> 10
     */
    int maxSum(BFSNode root) {
        if (root == null) {
            return 0;
        }

        int result = root.value;

        Queue<BFSNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) { // O(n) . nested loop로 보이지만 한번 만 돈다.
            int count = q.size();
            int sum = 0;
            while (count > 0) {
                count--;

                BFSNode node = q.poll();
                //전처리 - value 값 계산
                sum += node.value;

                //후처리 - 다음 노드 준비
                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            result = Math.max(result, sum);
        }

        return result;
    }
}
