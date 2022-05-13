package com.study.algorithm.stack;

import java.util.LinkedList;

public class EvaluationPostfix {
    int evaluate(String s) {
        LinkedList<Integer> numbers = new LinkedList<>();
        char[] chars = s.trim().toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                numbers.push(Integer.parseInt(c + ""));
            } else {
                int right = numbers.pop();
                int left = numbers.pop();

                switch (c) {
                    case '+':
                        numbers.push(left + right);
                        break;
                    case '-':
                        numbers.push(left - right);
                        break;
                    case '*':
                        numbers.push(left * right);
                        break;
                    case '/':
                        numbers.push(left / right);
                        break;
                }
            }
        }
        return numbers.pop();
    }
}
