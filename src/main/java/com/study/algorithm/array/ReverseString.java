package com.study.algorithm.array;

public class ReverseString {

    /**
     * 문자열을 거꾸로 뒤집기
     * hello
     * 0 -> 4
     * 1 -> 3
     * 2 -> 2
     * 3 -> 1
     * 4 -> 0
     *
     * 0 -> 4  4 - 0 - > 4
     * 1 -> 3  4 - 1 -> 3
     * 2 -> 2  4 - 2 -> 2
     * 3 -> 1  4 - 3 -> 1
     * 4 -> 0  4 - 4 -> 0
     *
     * (length-1) - i
     */

    char[] newArray(char[] message) { // T: O(n) S: O(n)
        char[] reversedMessage = new char[message.length];

        for (int i = message.length - 1 ; i >= 0 ; i--) {
            reversedMessage[message.length - 1 - i] = message[i];
        }

        return reversedMessage;
    }

    char[] selfSwap(char[] message) { // T: O(n) S: O(1)
        for (int i = 0 ; i < message.length/2 ; i++) { //반만 돌면 된다.
            char temp = message[i];
            message[i] = message[message.length - 1 - i];
            message[message.length - 1 - i] = temp;
        }
        return message;
    }


}
