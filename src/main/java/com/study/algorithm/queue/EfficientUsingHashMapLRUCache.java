package com.study.algorithm.queue;

import java.util.HashMap;

public class EfficientUsingHashMapLRUCache implements LRUCache{

    private int cacheSize;

    private HashMap<Integer, Node> map;

    private Node head, tail;

    public EfficientUsingHashMapLRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.map = new HashMap<>();
    }

    @Override
    public void query(int number) {
        if (map.containsKey(number)) {
            Node node = map.get(number);
            remove(node);
            addToHead(node);
        } else {
            Node nodeToAdd = new Node();
            nodeToAdd.value = number;
            if (map.size() == this.cacheSize) {
                map.remove(tail.value);
                remove(tail);
            }
            addToHead(nodeToAdd);
            map.put(number, nodeToAdd);
        }

    }

    private void addToHead(Node node) {
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    private void remove(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    @Override
    public void print() {
        Node current = this.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }

    @Override
    public HashMap<Integer, Node> getCache() {
        return map;
    }
}
