package com.study.algorithm.list;

public class LinkedListRevers {

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

    //answer
    /**
     * LinkedList 뒤집기
     *  예) 1 -> 2 -> 3   =>   3 -> 2 -> 1
     */
    void reverseWhile() { //T : O(N) S: O(1)
        LinkedNode current = this.head;
        LinkedNode prev = null;
        LinkedNode next = null;

        while (current != null) {
            next = current.next;    // 상태값 - next(다음) 임시 등록 : 다음 노드 조회

            // --> 다음 노드 변경 전 next 등록
            current.next = prev;    // reverse : 현재 노드의 next 주소 값을 prev(이전) 노드로 설정
            // --> 실제적인 노드 변경
            prev = current;         // 상태값 - prev(이전) 등록 : ***방금 뒤집은 노드***
            current = next;         // 상태값 - current(현재) 등록 : 다음 작업할 노드를 현재 노드로 등록
        }

        this.tail = this.head;
        this.head = prev;
    }

    void reverseWhile2() { //T : O(N) S: O(1)
        LinkedNode targetNode = this.head;
        LinkedNode prevNode = null;

        LinkedNode temp = null;

        while (targetNode != null) {
            temp = targetNode.next;         // 상태값 - next(다음) 임시 등록 : 다음 노드 조회

            // --> 다음 노드 변경 전 next 등록
            targetNode.next = prevNode;     // reverse : 현재 노드의 next 주소 값을 prev(이전) 노드로 설정
            // --> 실제적인 노드 변경

            prevNode = targetNode;          // 상태값 - prev(이전) 등록 : ***방금 뒤집은 노드***
            targetNode = temp;              // 상태값 - current(현재) 등록 : 다음 작업할 노드를 현재 노드로 등록
        }

        this.tail = this.head;
        this.head = prevNode;
    }

    void reverseRecursive() {
        LinkedNode head = this.head;
        this.head = reverseRecursive(head);
        this.tail = head;
    }

    private LinkedNode reverseRecursive(LinkedNode node) {
        if (node == null || node.next == null) {  // 리스트에 element 없는 경우 || 끝 노드인 경우
            return node;
        }

        LinkedNode newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;

        return newHead;
    }
}
