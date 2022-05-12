package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MakeTargetArraySumTest {
   
    @Test
    @DisplayName("타겟 숫자 만들 수 있는 인자 찾기")
    void makeTargetArraySumTest() {
        //given
        MakeTargetArraySum twoSumSolutions = new MakeTargetArraySum();

        //when
        int[] targetIndexes = twoSumSolutions.usingMap(new int[]{2, 3, 4, 7}, 6);

        //then
        assertThat(targetIndexes).isEqualTo(new int[]{2,0});
    }

}