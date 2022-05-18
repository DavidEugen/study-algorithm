package com.study.algorithm.list;

import java.util.HashMap;
import java.util.Map;

public class LinkedListFindNumber {

    //given
    private LinkedNode head;
    private LinkedNode tail;

    //given
    public void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

    //given
    public void print() {
        LinkedNode nodeToPrint = this.head;
        while(nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    /**
     * LinkedList 끝에서 n번째에 위치한 노드 찾기
     *  예) findFromLast(1 -> 4 -> 2 -> 3, 2), 끝에서 2번째에 위치한 2를 리턴한다.
     * @param n
     * @return
     */
    // 전체 사이즈를 먼저 알아야 한다.
    LinkedNode usingMap(int n) { // T: O(n) S: O(n)
        Map<Integer, LinkedNode> nodeMap = new HashMap<>();
        LinkedNode current = this.head;
        int i = 0;
        while(current != null) {
            nodeMap.put(i++, current);
            current = current.next;
        }

        return nodeMap.get(nodeMap.size() - n);
    }

    LinkedNode usingWhile(int n) { // T: O(n) S: O(1) 2번 돌기
        LinkedNode current = this.head;
        int length = 0;
        while(current != null) {
            length++;
            current = current.next;
        }

        int targetIndex = length - n;
        LinkedNode targetNode = this.head;
        while (targetIndex > 0) {
            targetNode = targetNode.next;
            targetIndex--;
        }

        return targetNode;
    }

    LinkedNode usingAddress(int n) { // T: O(n)  S: O(1)  1번만 돌기
        LinkedNode left = this.head;
        LinkedNode right = this.head;
        int count = 0;
        while(right.next != null) {
            if (count == n - 1) {
                left = left.next;
                right = right.next;
            } else if (count++ < n) {
                right = right.next;
            }
        }

        return left;
    }

}
