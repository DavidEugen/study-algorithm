package com.study.algorithm.array;

public class ReverseString {

    char[] newArray(char[] message) { // T: O(n) S: O(n)
        char[] reversedMessage = new char[message.length];

        for (int i = message.length - 1; i >= 0; i--) {
            reversedMessage[message.length - 1 - i] = message[i];
        }

        return reversedMessage;
    }

    char[] selfSwap(char[] message) { // T: O(n) S: O(1)
        for (int i = 0; i < message.length / 2; i++) { //반만 돌면 된다.
            char temp = message[i];
            /*
             * 양쪽 수렴하는 방법 대칭 그래프
             * y = a - x
             *
             * 반대편 숫자 인덱스 <= 이전 숫자 인덱스로 하면 temp로 안 옮겨 졌는데 덮어써 지기 때문에..
             * 이전 숫자 인덱스 <= 반대편 숫자 인덱스 (counter index)
             *
             * counter index  = last index - prev index
             *                 = ( Length - 1 ) - prev index
             * */

            message[i] = message[message.length - 1 - i];
            message[message.length - 1 - i] = temp;
        }
        return message;
    }


}
