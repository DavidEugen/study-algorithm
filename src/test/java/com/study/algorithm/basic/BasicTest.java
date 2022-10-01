package com.study.algorithm.basic;

import com.study.algorithm.basic.Basic.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Test
    @DisplayName("기본 값 비교")
    void basicCompare() {
        Node aNode = new Node();
        aNode.setData("1");
        Node bNode = aNode;
        bNode.setData("2");
        System.out.println(aNode.getData());
    }
}
