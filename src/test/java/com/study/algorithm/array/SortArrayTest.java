package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortArrayTest {
    /*
     * 배열 4
     * 1부터 100 까지의 숫자 중에 중복되지 않는 50개의 랜덤한 숫자가 들어있는 배열
     * O(n)의 시간 복잡도로 정렬
     *
     * Hint : 중복되지 않고 / 100개라는 제한된 크기 / 양수(인덱스로 사용 가능)
     * => boolean 배열을 이용한 아이디어
     * */

    @Test
    @DisplayName("O(n)의 시간 복잡도 정렬")
    void sortArrayTest() {
        //given
        SortArray sortArray = new SortArray();

        //when
        int[] result = sortArray.sortArray(new int[]{2, 4, 100, 5, 9, 6});

        //then
        assertThat(result).isEqualTo(new int[]{2, 4, 5, 6, 9, 100});
    }

    @Test
    @DisplayName("배열 생성 테스트")
    void booleanGenTest() {
        boolean[] booleans = new boolean[10];
        for (int i = 0; i < booleans.length; i++) {
            System.out.printf("booleans[%d] = %b\n", i, booleans[i]);
        }
    }

    @Test
    @DisplayName("boolean 배열 만들기")
    void makeBooleanArray() {
        //given
        SortArray sortArray = new SortArray();
        int arraySize = 5;

        //when
        boolean[] result = sortArray.makeBooleanArray(new int[]{1, 3}, arraySize);

        //then
        assertThat(result).isEqualTo(new boolean[]{true, false, true, false, false});
    }


}