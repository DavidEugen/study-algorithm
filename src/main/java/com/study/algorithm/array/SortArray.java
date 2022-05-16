package com.study.algorithm.array;

public class SortArray {

    private int ARRAY_SIZE = 100;

    int[] solution(int[] numbers) {

        boolean[] booleans = makeBooleanArray(numbers, ARRAY_SIZE);

        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            int realNumber = i + 1;
            if (booleans[i]) {
                numbers[index++] = realNumber;
            }
        }

        return numbers;
    }

    public boolean[] makeBooleanArray(int[] numbers, int arraySize) {
        boolean[] booleans = new boolean[arraySize];

        for (int num : numbers) {
            booleans[num-1] = true;
        }
        return booleans;
    }
}
