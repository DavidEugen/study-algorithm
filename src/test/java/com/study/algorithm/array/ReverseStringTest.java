package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseStringTest {
    /*
     * 배열 2
     * 문자열을 거꾸로 뒤집기
     * hello
     * 0 -> 4
     * 1 -> 3
     * 2 -> 2
     * 3 -> 1
     * 4 -> 0
     *
     * 0 -> 4  4 - 0 - > 4
     * 1 -> 3  4 - 1 -> 3
     * 2 -> 2  4 - 2 -> 2
     * 3 -> 1  4 - 3 -> 1
     * 4 -> 0  4 - 4 -> 0
     *
     * (length-1) - i
     * */
    @Test
    @DisplayName("문자열 뒤집기 - newArray")
    void newArrayTest() {
        //given
        ReverseString reverseString = new ReverseString();

        //when
        char[] result = reverseString.newArray("Hello".toCharArray());

        //then
        assertThat(result).isEqualTo(new char[]{'o', 'l', 'l', 'e', 'H'});
    }

    @Test
    @DisplayName("문자열 뒤집기 - newArray")
    void selfSwapTest() {
        //given
        ReverseString reverseString = new ReverseString();

        //when
        char[] result = reverseString.selfSwap("Hello".toCharArray());

        //then
        assertThat(result).isEqualTo(new char[]{'o', 'l', 'l', 'e', 'H'});
    }
}