package com.study.algorithm.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidateBSTTest {

    @Test
    @DisplayName("")
    void validateBST() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(5);

        ValidateBST validateBST = new ValidateBST();
        System.out.println(validateBST.solution(root));
    }

}