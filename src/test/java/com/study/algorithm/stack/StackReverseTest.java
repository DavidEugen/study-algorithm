package com.study.algorithm.stack;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Stack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackReverseTest {

    @Test
    @DisplayName("stack 뒤집기")
    void stackReverse() {
        //given
        Stack<Integer> numbers = new Stack();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        //when
        StackReverse reverseStack = new StackReverse();
        reverseStack.usingRecursive(numbers);

        //then
        assertThat(numbers.pop()).isEqualTo(1);
        assertThat(numbers.pop()).isEqualTo(2);
        assertThat(numbers.pop()).isEqualTo(3);
    }

}