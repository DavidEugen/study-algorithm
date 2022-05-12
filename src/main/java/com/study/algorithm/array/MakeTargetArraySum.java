package com.study.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class MakeTargetArraySum {

    int[] nestedLoop(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    int[] usingMap(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i) {
                return new int[] {i, numberMap.get(numberToFind)};
            }

            numberMap.put(numbers[i], i);
        }

        return null;
    }

}
