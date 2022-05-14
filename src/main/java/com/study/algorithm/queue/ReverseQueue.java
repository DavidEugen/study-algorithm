package com.study.algorithm.queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public Queue<Integer> usingLoop(Queue<Integer> numbers) {
        Stack<Integer> stack = new Stack<>();
        while (!numbers.isEmpty()) {
            stack.push(numbers.poll());
        }
        while (!stack.isEmpty()) {
            numbers.offer(stack.pop());
        }

        return numbers;
    }

    Queue<Integer> usingRecursive(Queue<Integer> numbers) {
        if (numbers.isEmpty()) {
            return numbers;
        }

        int front = numbers.poll();
        numbers = usingRecursive(numbers);
        numbers.offer(front);

        return numbers;
    }
}
