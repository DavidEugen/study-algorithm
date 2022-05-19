package com.study.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPushEfficient {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    Integer pop() { //O(n)
        if (q1.isEmpty()) {
            return null;
        };

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        Integer value = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return value;
    }

    void push(int number) { //O(1)
        q1.offer(number);
    }

}
