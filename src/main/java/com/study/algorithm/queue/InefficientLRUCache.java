package com.study.algorithm.queue;

import java.util.Deque;
import java.util.LinkedList;

public class InefficientLRUCache implements LRUCache{
    // 비효율적 방 - 데이터 조회 삭제시 O(N)
    private int cacheSize;

    private Deque<Integer> cache;

    public InefficientLRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        cache = new LinkedList<>();
    }

    @Override
    public void query(int number) {
        if (!cache.contains(number)) {
            if (cache.size() == this.cacheSize) {
                cache.removeLast();
            }
            cache.addFirst(number);
        } else {
            cache.remove(number);
            cache.addFirst(number);
        }
    }

    @Override
    public void print() {
        System.out.println(cache);
    }

    @Override
    public Deque<Integer> getCache() {
        return cache;
    }
}
