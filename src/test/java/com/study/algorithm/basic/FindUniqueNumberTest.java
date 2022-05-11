package com.study.algorithm.basic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindUniqueNumberTest {

    @Test
    @DisplayName("유일한 숫자 찾기")
    void findUniqueNumberTest() {
        //given
        FindUniqueNumber findUniqueNumber = new FindUniqueNumber();

        //when
        int result = findUniqueNumber.findWithBitOperation(new int[]{1, 2, 2, 3, 3});

        //then
        assertThat(result).isEqualTo(1);

    }

}