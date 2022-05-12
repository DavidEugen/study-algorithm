package com.study.algorithm.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MakeTargetArraySumTest {
   
    @Test
    @DisplayName("문자열 뒤집기")
    void reverseStringTest() {
        //given
        MakeTargetArraySum twoSumSolutions = new MakeTargetArraySum();

        //when
        int[] targetIndexes = twoSumSolutions.usingMap(new int[]{2, 3, 4, 7}, 6);

        //then
        Assertions.assertThat(targetIndexes).isEqualTo(new int[]{2,0});
    }

}