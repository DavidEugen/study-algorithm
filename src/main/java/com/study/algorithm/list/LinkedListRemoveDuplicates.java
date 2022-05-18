package com.study.algorithm.list;

import java.util.HashSet;
import java.util.Set;

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

    void removeDuplicatesAll() { // T: O(n)  S: O(1)
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

    void removeDuplicatesAll2() { // T: O(n)  S: O(1)
        LinkedNode current = this.head;
        LinkedNode prev = this.head;

        while (current != null) {
            if (current.number != prev.number) { // 다음 노드와 다를때 prev 이동
                prev.next = current; //
                prev = current;
            }
            current = current.next; //current는 계속 전진
        }

        //마지막에 같은수가 반복되다가 끝나면 prev는 바로 직전에 멈춰있기때문에 끊어 줘야 한다.
        if (prev != current) {
            prev.next = null;
        }
    }

    void removeDuplicateUsingRecursive() {
      removeDuplicateRecursive(this.head);
    }

    private LinkedNode removeDuplicateRecursive(LinkedNode node) {
        //종료조건
        if (node == null) {
            return null;
        }

        //재귀 작업
        if (node.next != null) {
            if (node.number == node.next.number) { //현재 노드값과 다음 노드값 같으면 링크 제거 중복제거
                node.next = node.next.next;
                removeDuplicateRecursive(node);
            } else { //다르면 다음 수행
                removeDuplicateRecursive(node.next);
            }
        }

        return node;
    }

    void removeDuplicateUsingSet() { //T: O(n)  S: O(n)
        Set<Integer> numberSet = new HashSet<>();

        LinkedNode current = this.head;
        LinkedNode prev = null;

        //처음
//        while (current != null) {
//            int currentNumber = current.number;
//            if (numberSet.contains(currentNumber)) {
//
//            } else {
//                numberSet.add(currentNumber); //set에 추가하고
//                prev = current; // 넘어간다 - prev 재설정
//            }
//
//            current = current.next; // 넘어간다 - current 재설정
//        }

        while (current != null) {
            int currentNumber = current.number;
            if (numberSet.contains(currentNumber)) {
                prev.next = current.next; //같을 동안에 prev가 가리키는 다음 노드를 업데이트 해 준다.
            } else {
                numberSet.add(currentNumber); //set에 추가하고
                prev = current ;// 넘어간다 - prev 재설정
            }

            current = current.next; // 넘어간다 - current 재설정
        }
    }


}
