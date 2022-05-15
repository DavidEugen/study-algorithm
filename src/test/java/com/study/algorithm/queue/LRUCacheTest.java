package com.study.algorithm.queue;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LRUCacheTest {
    /**
     * 최대 n개 만큼의 가장 최근에 접근한 데이터를 캐싱하는 LRU (least recently used) 캐시 구하기
     * 입력값 number는 1부터 100까지의 숫자가 랜덤하게 입력
     * 그 중에 최대 n (1보다 크고 9보다 작은)개 만큼의 데이터만 캐시할 수 있다.
     * n개를 넘는 새로운 값이 들어오면 그 중에서 가장 오래전에 접근한 데이터를 삭제하고 number를 캐시에 추가한다.
     *  다음 오퍼레이션을 구현하라.
     *  query(int number): number에 해당하는 입력값을 캐시에 추가한다.
     *  print() 현재 캐시하고 있는 데이터를 출력한다.
     */


    @Test
    @DisplayName("LRU(least recently used)cache 구현 Queue 이용 - O(N)")
    void inefficientLRUCache() {
        //given
        LRUCache lruCache = new InefficientLRUCache(3);

        //when
        lruCache.query(1);
        lruCache.query(2);
        lruCache.query(3);
        lruCache.query(1);
        lruCache.query(4);
        lruCache.query(5);
        lruCache.query(2);
        lruCache.query(2);
        lruCache.query(1);

        //then
        assertThat(lruCache.getCache()).isEqualTo(Arrays.asList(1,2,5));
        lruCache.print();
    }

    @Test
    @DisplayName("LRU(least recently used)cache 구현 HashMap 이용 - O(1)")
    void efficientMapLRUCache() {
        //given
        LRUCache lruCache = new EfficientUsingHashMapLRUCache(3);

        //when
        lruCache.query(1);
        lruCache.query(2);
        lruCache.query(3);
        lruCache.query(1);
        lruCache.query(4);
        lruCache.query(5);
        lruCache.query(2);
        lruCache.query(2);
        lruCache.query(1);

        //then
//        assertThat(lruCache.getCache()).isEqualTo(Arrays.asList(1,2,5));
        lruCache.print();
    }

    @Test
    @DisplayName("LRU(least recently used)cache 구현 LinkedHashSet 이용 O(1)")
    void efficientSetLRUCache() {
        //given
        LRUCache lruCache = new EfficientUsingLinkedHashSetLRUCache(3);

        //when
        lruCache.query(1);
        lruCache.query(2);
        lruCache.query(3);
        lruCache.query(1);
        lruCache.query(4);
        lruCache.query(5);
        lruCache.query(2);
        lruCache.query(2);
        lruCache.query(1);

        //then

        lruCache.print();
    }
}