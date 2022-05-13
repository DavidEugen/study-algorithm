package com.study.algorithm.list;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListReverseTest {
    LinkedListRevers list;
    LinkedListRevers resultList;

    @BeforeEach
    void setting() {
        //given
        list = new LinkedListRevers();
        resultList = new LinkedListRevers();

        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));

        resultList.add(new LinkedNode(3));
        resultList.add(new LinkedNode(2));
        resultList.add(new LinkedNode(1));
    }

    @Test
    @DisplayName("LinkedList 뒤집기 - while")
    void linkedListReverseWhile() {
        //when
        list.print();
//        list.reverseWhile();
        list.reverseRecursive();

        //then
        list.print();
        // TODO LinkedList Eqauls method 구현하기
//        assertThat(list).isEqualTo(resultList);
    }

//    @Test
//    @DisplayName("LinkedList 뒤집기 - recursive")
//    void linkedListReserveRecursive() {
//        //when
//        list.reverseRecursive();
//
//        //then
//        assertThat(list).isEqualTo(resultList);
//
//    }

}