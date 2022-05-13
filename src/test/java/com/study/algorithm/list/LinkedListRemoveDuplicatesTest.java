package com.study.algorithm.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListRemoveDuplicatesTest {

    @Test
    @DisplayName("")
    void linkedListRemoveDuplicatesTest() {
        LinkedListRemoveDuplicates list = new LinkedListRemoveDuplicates();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(4));

        list.print();
        list.removeDuplicatesAll();
        list.print();

    }


}