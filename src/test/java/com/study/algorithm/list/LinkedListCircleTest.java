package com.study.algorithm.list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListCircleTest {
    @Test
    @DisplayName("원형 LinkedList 검증 - 검증 실패")
    void linkedListCircleFalseTest() {
        LinkedListCircle list = new LinkedListCircle();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
//        LinkedNode node3 = new LinkedNode(3);
//        list.add(node3);
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(5));
//        list.add(node3);

//        list.print();
        System.out.println(list.wrongAnswer());
    }

    @Test
    @DisplayName("원형 LinkedList 검증")
    void linkedListCircleTest() {
        LinkedListCircle list = new LinkedListCircle();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        LinkedNode node3 = new LinkedNode(3);
        list.add(node3);
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(5));
        list.add(node3);

//        list.print();
        System.out.println(list.hasCircle1());
    }

    @Test
    @DisplayName("원형 LinkedList 검증 - 플로이드의 토끼와 거북이 알고리즘")
    void floydDetectionTest() {
        LinkedListCircle list = new LinkedListCircle();
//        list.add(new LinkedNode(1));
//        list.add(new LinkedNode(2));
//        LinkedNode node3 = new LinkedNode(3);
//        list.add(node3);
//        list.add(new LinkedNode(4));
//        list.add(new LinkedNode(5));
//        list.add(node3);

//        list.print();
        System.out.println(list.floydDetection());
    }


}