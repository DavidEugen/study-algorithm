package com.study.algorithm.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueueStackTest {

    @Test
    @DisplayName("Pop O(1)")
    void queueStackTest() {
        QueueStackPopEfficient stack = new QueueStackPopEfficient();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop() == 3);
        System.out.println(stack.pop() == 2);
        System.out.println(stack.pop() == 1);
    }

    @Test
    @DisplayName("Push O(1)")
    void queueStackPushTest() {
        QueueStackPushEfficient stack = new QueueStackPushEfficient();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop() == 3);
        System.out.println(stack.pop() == 2);
        System.out.println(stack.pop() == 1);
    }

}