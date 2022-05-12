package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortArrayTest {

    /**
     * 1부터 100 까지의 숫자 중에 50개의 랜덤한 숫자가 들어있는 배열
     * O(n)의 시간 복잡도로 정렬
     */

    @Test
    @DisplayName("O(n)의 시간 복잡도 정렬")
    void reverseStringTest() {
        //given
        SortArray sortArray = new SortArray();

        //when
        int[] result = sortArray.solution(new int[]{2, 4, 1, 5, 6, 9});

        //then
        assertThat(result).isEqualTo(new int[]{1,2, 4, 5, 6, 9});
    }


}