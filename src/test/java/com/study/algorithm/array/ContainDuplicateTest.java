package com.study.algorithm.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("중복 여부 확인")
class ContainDuplicateTest {
    /*
     * 배열 1
     * 중복 여부 확인
     * 예) 1 2 3 4 5 6 => false
     * 예) 1 1 2 2 3 1 => true
     * */

    @Test
    @DisplayName("중복 존재 여부 확인 False")
    void nestedLoopFalse() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.nestedLoop(new int[]{1, 2, 3, 4, 5});
        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 True")
    void nestedLoopTrue() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.nestedLoop(new int[]{1, 2, 3, 4, 5, 1});
        //then
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 False")
    void loopAfterSortFalse() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.loopAfterSort(new int[]{1, 2, 3, 4, 5});
        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 True")
    void loopAfterSortTrue() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.loopAfterSort(new int[]{1, 2, 3, 4, 5, 1});
        //then
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 False")
    void usingSetSortFalse() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.usingSet(new int[]{1, 2, 3, 4, 5});
        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("중복 존재 여부 확인 True")
    void usingSetSortTrue() {
        //given
        ContainDuplicate containDuplicate = new ContainDuplicate();
        //when
        boolean result = containDuplicate.usingSet(new int[]{1, 2, 3, 4, 5, 1});
        //then
        assertThat(result).isEqualTo(true);
    }

}