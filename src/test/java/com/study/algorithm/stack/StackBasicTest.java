package com.study.algorithm.stack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackBasicTest {

    @Test
    @DisplayName("Stack 기본")
    void stackBasic() {
        //given
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        //when//then
        assertThat(numbers.peek()).isEqualTo(3);
        assertThat(numbers.pop()).isEqualTo(3);
        assertThat(numbers.pop()).isEqualTo(2);
        assertThat(numbers.pop()).isEqualTo(1);

    }


}