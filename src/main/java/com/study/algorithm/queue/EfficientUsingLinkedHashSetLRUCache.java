package com.study.algorithm.queue;

import java.util.LinkedHashSet;
import java.util.Set;

public class EfficientUsingLinkedHashSetLRUCache implements LRUCache{

    private int cacheSize;

    private Set<Integer> cache;

    public EfficientUsingLinkedHashSetLRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.cache = new LinkedHashSet<>(cacheSize);
    }

    @Override
    public void query(int number) {
        if (!cache.contains(number)) {
            if (cache.size() == cacheSize) {
                int firstKey = cache.iterator().next(); // O(1) 첫번째 노드만 가져 오므로..
                cache.remove(firstKey);
            }

            cache.add(number);
        } else {
            cache.remove(number); // O(1)
            cache.add(number);
        }
    } // 공간 복잡도는 O(n) 보다 작다, 종단 노드의 개수보다 작거나 같다. ( 마지막 레이어의 종단 노드 갯수)

    @Override
    public void print() {
        System.out.println(cache);
    }

    @Override
    public Object getCache() {
        return cache;
    }
}
