package com.study.algorithm.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InfixToPostfixTest {

    @Test
    @DisplayName("인픽스를 포스트픽스로 변환하기")
    void infixToPostfixTest() {
        /**
         * 인픽스를 포스트픽스로 변환하기
         */
        //given
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String test1 = "(1+2)*3";
        String test2 = "1+2*3";

        //when//then
        Assertions.assertThat(infixToPostfix.convert(test1)).isEqualTo("12+3*");
        Assertions.assertThat(infixToPostfix.convert(test2)).isEqualTo("123*+");
    }

}