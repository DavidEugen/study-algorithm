package com.study.algorithm.queue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Deque;
import java.util.LinkedList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueueBasicTest {

    @Test
    @DisplayName("Queue 테스트")
    void queueBasicTest() {
        /* FIFO */
        //given
        Deque<Integer> numbers = new LinkedList<>();

        //when
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);

        //then
        Assertions.assertThat(numbers.getLast()).isEqualTo(1);
        System.out.println(numbers.getLast());
    }
}