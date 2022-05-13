package com.study.algorithm.list;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCircle {

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

    boolean hasCircle1() {
        Set<LinkedNode> nodeSet = new HashSet<>();
        LinkedNode current = this.head;
        while (current != null) {
            if (nodeSet.contains(current)) {
                return true;
            } else {
                nodeSet.add(current);
            }

            current = current.next;
        }

        return false;
    }

    boolean hasCircle2() {
        LinkedNode slow = this.head;
        LinkedNode fast = this.head;

        while(fast != null) {
            if (fast.next == null || fast.next.next == null) {
                return false;
            }

            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

            slow = slow.next;
        }

        return false;
    }



}
