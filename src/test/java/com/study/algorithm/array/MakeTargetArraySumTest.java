package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MakeTargetArraySumTest {
    /*
     * 배열 3
     * 숫자로 구성된 배열 numbers와 target 숫자 하나가 주어졌을 때
     * numbers 배열에 들어있는 두 수를 더해 target 숫자를 만들 수 있는 인덱스 두개를 찾는 함수를 작성하라.
     *
     * 예) numbers = [2, 3, 5, 7] target = 8, 8을 만들 수 있는 3과 5의 인덱스인 1, 2를 리턴해야 한다.
     * numbers 배열에 중복되는 숫자는 없으며 target 숫자를 만들 수 있는 조합은 하나 뿐이라고 가정해도 좋다.
     * */

    @Test
    @DisplayName("타겟 숫자 만들 수 있는 인자 찾기")
    void makeTargetArraySumTest() {
        //given
        MakeTargetArraySum twoSumSolutions = new MakeTargetArraySum();

        //when
        int[] targetIndexes = twoSumSolutions.usingMap(new int[]{2, 3, 4, 7}, 6);

        //then
        assertThat(targetIndexes).isEqualTo(new int[]{2, 0});
    }


    @Test
    @DisplayName("타겟 숫자 만들 수 있는 인자 찾기")
    void makeTargetArrayThreeSumTest() {
        //given
        MakeTargetArraySum twoSumSolutions = new MakeTargetArraySum();

        //when
        int[] targetIndexes = twoSumSolutions.usingMap(new int[]{2, 3, 4, 7}, 10);

        //then
        assertThat(targetIndexes).isEqualTo(new int[]{2, 0});
    }

}