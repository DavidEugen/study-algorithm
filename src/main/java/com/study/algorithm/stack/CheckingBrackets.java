package com.study.algorithm.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CheckingBrackets {

    boolean firstIdea(String mathExpression) {
        Stack<Character> brackets = new Stack<>();
        char[] chars = mathExpression.toCharArray();

        for (char c: chars) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    brackets.push(c);
                    break;
                case ')':
                    if (brackets.isEmpty() || brackets.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (brackets.isEmpty() || brackets.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (brackets.isEmpty() || brackets.pop() != '[') {
                        return false;
                    }
                    break;

            }
        }
        return true;
    }

    boolean check(String mathExpression) {
        Stack<Character> brackets = new Stack<>();
        List<Character> openingBrackets = Arrays.asList('{', '[', '(');
        List<Character> closingBrackets = Arrays.asList('}', ']', ')');

        for (char c : mathExpression.toCharArray()) {
            if (openingBrackets.contains(c)) {
                brackets.push(c);
            } else if(closingBrackets.contains(c)) {
                if (brackets.isEmpty()) {
                    return false;
                }
                Character openingBracket = brackets.pop();
                if (openingBrackets.indexOf(openingBracket) != closingBrackets.indexOf(c)) {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }

}
