package com.study.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPopEfficient {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    Integer pop() { //O(1)
        if (q1.isEmpty()) {
            return null;
        };

        return q1.poll();
    }

    void push(int number) { //O(n) // 넣을때 swap
        q2.offer(number);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

}
