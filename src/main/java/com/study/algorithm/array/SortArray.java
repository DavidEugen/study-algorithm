package com.study.algorithm.array;

public class SortArray {

    int[] solution(int[] numbers) {
        boolean[] booleans = new boolean[100];
        for (int num : numbers) {
            booleans[num] = true;
        }

        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                numbers[index++] = i;
            }
        }

        return numbers;
    }
}
