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
    void reverseWhile() {
        LinkedNode current = this.head;
        LinkedNode prev = null;
        LinkedNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        this.tail = this.head;
        this.head = prev;
    }

    void reverseRecursive() {
        LinkedNode head = this.head;
        this.head = reverseRecursive(head);
        this.tail = head;
    }

    private LinkedNode reverseRecursive(LinkedNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        LinkedNode newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;

        return newHead;
    }
}
