package com.study.algorithm.stack;

import java.util.Stack;

public class StackReverse {

    Stack<Integer> usingNewStack(Stack<Integer> stack) { //T: O(n) S: O(n)
        Stack<Integer> reversedStack = new Stack<>();
        while(!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }
        return reversedStack;
    }

    void usingRecursive(Stack<Integer> stack) { //T: O(n2) s: O(n) 추천하는 방법은 아니다. 재귀를 사용하여 구현 할 수 있는지 알아보는 문제
        if (stack.isEmpty()) return;
        int temp = stack.pop();
        usingRecursive(stack);
        insertAtBottom(stack, temp);
    }

    void insertAtBottom(Stack<Integer> stack, int number) {
        if (stack.isEmpty()) {
            stack.push(number);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, number);
        stack.push(temp);
    }

}
