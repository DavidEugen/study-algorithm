package com.study.algorithm.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CheckingBrackets {
    boolean check(String mathExpression) {
        Stack<Character> brackets = new Stack<>();
        List<Character> openingBrackets = Arrays.asList('{', '[', '(');
        List<Character> closingBrackets = Arrays.asList('}', ']', ')');

        for (char c : mathExpression.toCharArray()) {
            if (openingBrackets.contains(c)) {
                brackets.push(c);
            } else if(closingBrackets.contains(c)) {
                Character openingBracket = brackets.pop();
                if (openingBrackets.indexOf(openingBracket) != closingBrackets.indexOf(c)) {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }

}
