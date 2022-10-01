package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("중복 여부 확인")
class ContainDuplicateTest {

    /**
     *  예) 1 2 3 4 5 6 => false
     *  예) 1 1 2 2 3 1 => true
     */

    @Test
    @DisplayName("중복 존재 여부 확인 - T: O(n2) S: O(1)")
    void nestedLoopFalse() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.nestedLoop(new int[]{1, 2, 3, 4, 5});
        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 - T: O(n2) S: O(1)")
    void nestedLoopTrue() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.nestedLoop(new int[]{1, 2, 3, 4, 5, 1});
        //then
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 - T: O(NlogN) S: O(logN)")
    void loopAfterSortFalse() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.loopAfterSort(new int[]{1, 2, 3, 4, 5});
        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 - T: O(NlogN) S: O(logN)")
    void loopAfterSortTrue() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.loopAfterSort(new int[]{1, 2, 3, 4, 5, 1});
        //then
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 - T: O(N) S: O(N)")
    void usingSetSortFalse() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.usingSet(new int[]{1, 2, 3, 4, 5});
        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 - T: O(N) S: O(N)")
    void usingSetSortTrue() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.usingSet(new int[]{1, 2, 3, 4, 5, 1});
        //then
        assertThat(result).isEqualTo(true);
    }

}