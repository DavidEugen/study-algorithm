package com.study.algorithm.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NextGreaterElementTest {

    @Test
    @DisplayName("")
    void nextGreaterElementTest() {
        /**
         * 주어진 배열의 오른쪽에 처음으로 등장하는 현재 숫자보다 큰 수를 담고 있는 배열을 만드는 코드를 작성하라.
         *  예) [1, 1, 2, 3]   =>   [2, 2, 3, -1]
         *  예) [10, 4, 2, 30]   =>  [30, 30, 30, -1]
         *  예) [82, 7, 15]   =>  [-1, 15, -1]
         */
        //given
        NextGreaterElement nextGreaterElement = new NextGreaterElement();

        //when
        System.out.println(Arrays.toString(nextGreaterElement.solution(new int[]{1, 1, 2, 3})));
        System.out.println(Arrays.toString(nextGreaterElement.solution(new int[]{10, 4, 2, 30})));
        System.out.println(Arrays.toString(nextGreaterElement.solution(new int[]{82, 7, 15})));
    }
}