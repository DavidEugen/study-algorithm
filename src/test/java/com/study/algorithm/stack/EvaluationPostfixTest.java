package com.study.algorithm.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EvaluationPostfixTest {

    @Test
    @DisplayName("포스트픽스로 주어진 식을 계산")
    void evaluationPostfixTest() {
        /**
         * 포스트픽스로 주어진 식을 계산 하기. 수식은 사칙연산 (+, -, *, /)만 사용한다고 가정한다.
         *  예) 12+      => 3
         *  예) 123+-5*  => -20
         */
        //given
        EvaluationPostfix postfix = new EvaluationPostfix();

        //when//then
        Assertions.assertThat(postfix.evaluate("52+")).isEqualTo(7);
        Assertions.assertThat(postfix.evaluate("52-")).isEqualTo(3);
        Assertions.assertThat(postfix.evaluate("52*")).isEqualTo(10);
        Assertions.assertThat(postfix.evaluate("52/")).isEqualTo(2);
        Assertions.assertThat(postfix.evaluate("521+-9*")).isEqualTo(18);
    }


}