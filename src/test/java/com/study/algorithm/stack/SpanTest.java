package com.study.algorithm.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpanTest {

    @Test
    @DisplayName("")
    void SpanTest() {
        /**
         * 주어진 배열 prices에 대한 스팬을 구하는 코드를 작성하라.
         *  스팬: 당일의 주가 보다 낮거나 같았던 연속적인 일 수.
         *  예) [5, 3, 2, 4, 7, 1]    =>   [1, 1, 1, 3, 5, 1]
         *  예) [2, 3, 4, 5, 6, 7]    =>   [1, 2, 3, 4, 5, 6]
         */

        //given
        Span span = new Span();
        int[] givenArray1 = {5, 3, 2, 4, 7, 1};
        int[] givenArray2 = {2, 3, 4, 5, 6, 7};

        //when
        int[] solution1 = span.solution(givenArray1);
        int[] solution2 = span.solution(givenArray2);

        //then
        System.out.println(Arrays.toString(solution1));
        System.out.println(Arrays.toString(solution2));
    }

}