package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContainDuplicateTest {

    /**
     *  예) 1 2 3 4 5 6 => false
     *  예) 1 1 2 2 3 1 => true
     */

    @Test
    @DisplayName("중복 테스트")
    void duplicateTest() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.usingSort(new int[]{1, 2, 3, 4, 5});
        //then
        assertThat(result).isEqualTo(false);

    }

}