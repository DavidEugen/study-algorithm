package com.study.algorithm.queue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueueBasicTest {

    @Test
    @DisplayName("Queue 테스트")
    void queueBasicTest() {
        /* FIFO, LILO */
        //given
        Deque<Integer> numbers = new ArrayDeque<>();

        //when
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        numbers.offer(5);

        //then
        assertThat(numbers.peek()).isEqualTo(1);
        assertThat(numbers.poll()).isEqualTo(1);
        assertThat(numbers.poll()).isEqualTo(2);
        assertThat(numbers.poll()).isEqualTo(3);
        assertThat(numbers.poll()).isEqualTo(4);
        assertThat(numbers.poll()).isEqualTo(5);
    }

    @Test
    @DisplayName("Queue 삭제 테스트")
    void queueRemoveTest() {
        //given
        Deque<Integer> numbers = new ArrayDeque<>();

        //when
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        numbers.offer(5);

        //then
        assertThat(numbers.remove(3)).isEqualTo(true); // remove 는 인덱스로 삭제하는 것이 아니라 값으로 삭제하는 것이다. O(n)
        assertThat(numbers.remove(6)).isEqualTo(false);

        assertThat(numbers.peek()).isEqualTo(1);
        assertThat(numbers.poll()).isEqualTo(1);
        assertThat(numbers.poll()).isEqualTo(2);
        assertThat(numbers.poll()).isEqualTo(4);
        assertThat(numbers.poll()).isEqualTo(5);
    }

    @Test
    @DisplayName("Queue LinkedList 테스트")
    void queueBasicLinkedListTest() { // LinkedList도 일종의 queue
        //given
        Deque<Integer> numbers = new LinkedList<>();

        //when
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);

        //then
        assertThat(numbers.getLast()).isEqualTo(1);
        System.out.println(numbers.getLast());
    }
}