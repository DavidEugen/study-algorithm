package com.study.algorithm.array;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
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
        Assertions.assertThat(result).isEqualTo(new char[]{'o','l','l','e','H'});
    }
}