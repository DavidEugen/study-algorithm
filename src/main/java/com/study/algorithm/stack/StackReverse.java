package com.study.algorithm.stack;

import java.util.Stack;

public class StackReverse {

    Stack<Integer> usingNewStack(Stack<Integer> stack) {
        Stack<Integer> reversedStack = new Stack<>();
        while(!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }
        return reversedStack;
    }

    void usingRecursive(Stack<Integer> stack) {
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
