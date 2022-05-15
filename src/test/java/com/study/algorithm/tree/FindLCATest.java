package com.study.algorithm.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindLCATest {

    @Test
    @DisplayName("")
    void findLCA1Test() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        FindLCASolution1 findLCA = new FindLCASolution1();
        System.out.println(findLCA.solution(root, 4, 5));
        System.out.println(findLCA.solution(root, 2, 5));
        System.out.println(findLCA.solution(root, 3, 4));
        System.out.println(findLCA.solution(root, 3, 7));
        System.out.println(findLCA.solution(root, 3, 8));
    }

    @Test
    @DisplayName("")
    void findLCA2Test() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        FindLCASolution2 findLCA = new FindLCASolution2();
        System.out.println(findLCA.solution(root, 4, 5));
        System.out.println(findLCA.solution(root, 2, 5));
        System.out.println(findLCA.solution(root, 3, 4));
        System.out.println(findLCA.solution(root, 3, 7));
        System.out.println(findLCA.solution(root, 3, 8));
    }

    @Test
    @DisplayName("")
    void findLCA3Test() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        FindLCASolution3 findLCA = new FindLCASolution3();
        System.out.println(findLCA.solution(root, 1, 3)); // 2
        System.out.println(findLCA.solution(root, 1, 2)); // 2
        System.out.println(findLCA.solution(root, 1, 5)); // 4
        System.out.println(findLCA.solution(root, 5, 7)); // 6
        System.out.println(findLCA.solution(root, 2, 7)); // 4
    }

}