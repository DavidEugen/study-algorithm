package com.study.algorithm.array;

public class SortArray {

    private int ARRAY_SIZE = 100;

    int[] sortArray(int[] numbers) { // T: O(n) S: O(n)

        boolean[] booleans = makeBooleanArray(numbers, ARRAY_SIZE); // 경계값, 가장 큰값의 크기로 배열이 생긴다. NOT 주어진 배열의 갯수가 아니다.

        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            int realNumber = i + 1;
            if (booleans[i]) {
                numbers[index++] = realNumber;
            }
        }
        //공간 복잡도에 대한 언급이 없으므로 새로운 배열을 생각했었는데 필요없다.
        //이미 booleans 라는 새로운 배열을 받았기 때문 .. numbers 무의미
        return numbers;
    }

    public boolean[] makeBooleanArray(int[] numbers, int arraySize) {
        boolean[] booleans = new boolean[arraySize];

        for (int num : numbers) {
            booleans[num - 1] = true;
        }
        return booleans;
    }
}
