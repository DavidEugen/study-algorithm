package com.study.algorithm.queue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.Queue;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseQueueTest {

    @Test
    @DisplayName("Queue 뒤집기")
    void reverseQueue() {
        /**
         * 큐가 제공하는 오퍼레이션만 사용해서 큐 뒤집기
         * offer(E e): 큐의 끝에 데이터를 추가한다.
         * E poll(): 큐 헤드를 꺼낸다.
         * isEmpty(): 큐가 비어있는가.
         * 예) Q {1, 2, 3}  =>  Q {3, 2, 1}
         * */

        //given
        Queue<Integer> numbers = new ArrayDeque<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        //when
        ReverseQueue reverseQueue = new ReverseQueue();
        Queue<Integer> reversedNumber = reverseQueue.usingLoop(numbers);

        //then
        assertThat(numbers).isEqualTo(reversedNumber);
    }


}