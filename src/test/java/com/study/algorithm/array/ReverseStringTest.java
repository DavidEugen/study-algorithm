package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    @DisplayName("문자열 뒤집기")
    void reverseStringTest() {
        //given
        ReverseString reverseString = new ReverseString();

        //when
        char[] result = reverseString.selfMove("Hello".toCharArray());

        //then
        assertThat(result).isEqualTo(new char[]{'o','l','l','e','H'});
    }
}