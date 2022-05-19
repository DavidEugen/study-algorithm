package com.study.algorithm.queue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueueBasicTest {

    @Test
    @DisplayName("Queue 테스트")
    void queueBasicTest() { // Double Ended Queue - queue, stack 속성 둘다 가지고 있어서 넣고 빼는것 O(1),
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
    @DisplayName("Queue LinkedList Poll 테스트")
    void queueBasicLinkedListPollTest() { // LinkedList도 일종의 queue
        //given
        Deque<Integer> numbers = new LinkedList<>();

        //when
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);

        //then
        assertThat(numbers.peek()).isEqualTo(3);
        assertThat(numbers.getLast()).isEqualTo(1);

        assertThat(numbers.poll()).isEqualTo(3); //head 에서 빼기
        assertThat(numbers.poll()).isEqualTo(2);
        assertThat(numbers.poll()).isEqualTo(1);
        assertThat(numbers.poll()).isEqualTo(null);


    }

    @Test
    @DisplayName("Queue LinkedList Remove 테스트")
    void queueBasicLinkedListRemoveTest() { // LinkedList도 일종의 queue
        //given
        Deque<Integer> numbers = new LinkedList<>();

        //when
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);

        //then
        assertThat(numbers.peek()).isEqualTo(3);
        assertThat(numbers.getLast()).isEqualTo(1);

        assertThat(numbers.remove()).isEqualTo(3);
        assertThat(numbers.remove()).isEqualTo(2);
        assertThat(numbers.remove()).isEqualTo(1);
        assertThatThrownBy(() -> {
            numbers.remove();
        }).isInstanceOf(NoSuchElementException.class);

    }


    //Exception 발생
    //add() 넣고, 못 넣으면 IllegalStateException
    //remove() 꺼내고, 못 꺼내면 NoSuchElementException
    //element() 확인, 없으면 NoSuchElementException

    //offer() 넣고, 못넣으면 false
    //poll() 꺼내고, 못꺼내면 null
    //peek() 확인, 없으면 null
}