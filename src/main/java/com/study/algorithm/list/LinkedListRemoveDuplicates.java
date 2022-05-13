package com.study.algorithm.list;

public class LinkedListRemoveDuplicates {

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

    void removeDuplicatesAll() {
        LinkedNode current = this.head;
        while (current != null) {
            LinkedNode temp = current;
            while (temp != null && temp.number == current.number) {
                temp = temp.next;
            }

            current.next = temp;
            current = current.next;
        }
    }

    LinkedNode findFromLast2(int n) {
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

    LinkedNode findFromLast3(int n) {
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
