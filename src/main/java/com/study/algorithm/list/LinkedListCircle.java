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
        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }


    boolean wrongAnswer() { // 노드를 순회하면서 현재 노드가 다음 노드 중에 중복으로 나타나는지 확인하는 방법 => 무한 루프 빠질 수 있다.
        LinkedNode current = this.head;
        while (current != null) {
            LinkedNode temp = current.next;
            while (temp != null) {
                if (current == temp) {
                    return true;
                }
                temp = temp.next;
            }
            current = current.next;
        }

        return false;
    }

    boolean hasCircle1() { //T: O(n)  S: O(n)
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

    boolean floydDetection() { //T: O(n)  S: O(1)
        LinkedNode slow = this.head;
        LinkedNode fast = this.head;

        while (fast != null) { // fast 는 slow 보다 앞서 감으로 fast만 보면 된다.
            if (fast.next == null || fast.next.next == null) {  // fast 가 끝에 도달한다면 순환 생기지 않는다.
                return false;
            }

            //fast 2칸 전진
            fast = fast.next.next;
            if (slow == fast) { // fast 가 slow를 만나면 => fast 가 slow를 따라 잡은 것이므로 있다.
                return true;
            }
            // slow 아니라면 한칸 전진
            slow = slow.next;
        }

        return false;
    }


}
