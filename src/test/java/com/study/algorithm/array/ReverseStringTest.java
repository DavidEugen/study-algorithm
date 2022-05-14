package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    @DisplayName("문자열 뒤집기 - newArray - T: O(n) S: O(n)")
    void newArrayTest() {
        //given
        ReverseString reverseString = new ReverseString();

        //when
        char[] result = reverseString.newArray("Hello".toCharArray());

        //then
        assertThat(result).isEqualTo(new char[]{'o','l','l','e','H'});
    }

    @Test
    @DisplayName("문자열 뒤집기 - newArray - T: O(n) S: O(1)")
    void selfSwapTest() {
        //given
        ReverseString reverseString = new ReverseString();

        //when
        char[] result = reverseString.selfSwap("Hello".toCharArray());

        //then
        assertThat(result).isEqualTo(new char[]{'o','l','l','e','H'});
    }
}