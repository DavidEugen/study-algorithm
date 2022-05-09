package com.study.algorithm.hashtable;

class Node {
    String key;
    String value;
    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
