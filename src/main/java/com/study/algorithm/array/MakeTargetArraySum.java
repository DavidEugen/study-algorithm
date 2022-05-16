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

    int[] usingMap1(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);

        }

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i) { // 자기 자신이 답이 될 수 있으므로 인덱스에서 제외
                return new int[] {i, numberMap.get(numberToFind)};
            }
        }

        return null;
    }

    int[] usingMap(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i) { // 자기 자신이 답이 될 수 있으므로 인덱스에서 제외
                return new int[] {i, numberMap.get(numberToFind)};
            }

            numberMap.put(numbers[i], i);
        }

        return null;
    }



}
