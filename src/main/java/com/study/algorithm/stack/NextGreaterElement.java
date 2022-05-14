package com.study.algorithm.stack;

import java.util.Stack;

public class NextGreaterElement {
    public int[] solution(int[] numbers) {
        int[] nextGreaterElement = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(numbers.length - 1);
        nextGreaterElement[numbers.length - 1] = -1;

        for (int i = numbers.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && numbers[stack.peek()] <= numbers[i]) {
                stack.pop();
            }
            nextGreaterElement[i] = stack.isEmpty() ? -1 : numbers[stack.peek()];
            stack.push(i);
        }

        return nextGreaterElement;
    }
}
