package com.study.algorithm.array;

public class ReverseString {

    /**
     * 문자열을 거꾸로 뒤집기
     */

    char[] newArray(char[] message) {
        char[] reversedMessage = new char[message.length];

        for (int i = message.length - 1 ; i >= 0 ; i--) {
            reversedMessage[message.length - 1 - i] = message[i];
        }

        return reversedMessage;
    }

    char[] selfMove(char[] message) {
        for (int i = 0 ; i < message.length/2 ; i++) {
            char temp = message[i];
            message[i] = message[message.length - 1 - i];
            message[message.length - 1 - i] = temp;
        }
        return message;
    }


}
