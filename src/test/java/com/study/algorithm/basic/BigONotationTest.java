package com.study.algorithm.basic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BigONotationTest {

    @Test
    @DisplayName("유일한 숫자 찾기 - nestedLoop - T: O(n²) S: O(n)")
    void findUniqueNumberTest() {
        //given
        BigONotation findUniqueNumber = new BigONotation();

        //when
        int result = findUniqueNumber.findWithList(new int[]{1, 2, 2, 2, 2, 3, 3});

        //then
        assertThat(result).isEqualTo(1);

    }

    @Test
    @DisplayName("유일한 숫자 찾기 - doubleLoop - T: O(n) S: O(n)")
    void findWithHashMapTest() {
        //given
        BigONotation findUniqueNumber = new BigONotation();

        //when
        int result = findUniqueNumber.findWithHashMap(new int[]{2, 2, 2, 2, 3, 3, 1});

        //then
        assertThat(result).isEqualTo(1);

    }

    @Test
    @DisplayName("유일한 숫자 찾기 - doubleLoop - T: O(n) S: O(1)")
    void findWithBitOperationTest() {
        //given
        BigONotation findUniqueNumber = new BigONotation();

        //when
        int result = findUniqueNumber.findWithBitOperation(new int[]{2, 2, 2, 2, 3, 4, 3, 1});

        //then
        assertThat(result).isEqualTo(1);

    }

}