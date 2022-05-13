package com.study.algorithm.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListFindNumberTest {

    @Test
    @DisplayName("LinkedList 숫자 찾기")
    void findNumberTest() {

        //given
        LinkedListFindNumber list = new LinkedListFindNumber();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(5));

        list.print();
        //when
        LinkedNode node = list.usingAddress(2);
        System.out.println(node.number);
    }

}