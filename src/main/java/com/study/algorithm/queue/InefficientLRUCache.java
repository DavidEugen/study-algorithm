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
        if (!cache.contains(number)) { // 포함되어 있지 않다면 넣으면 되는데 O(n)
            if (cache.size() == this.cacheSize) {// 사이즈를 먼저 체크 해야지( 꽉 찼는지 )
                cache.removeLast(); // 꽉 찼으면 마지막꺼 지우고
            }
            cache.addFirst(number);
        } else {
            cache.remove(number); // 노드를 찾아서 삭제  O(n)
            cache.addFirst(number);
        }
    }

    //=> O(1)으로 만들기

    @Override
    public void print() {
        System.out.println(cache);
    }

    @Override
    public Deque<Integer> getCache() {
        return cache;
    }
}
