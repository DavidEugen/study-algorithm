package com.study.algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    private boolean innerLoop(int[] numbers) {
        for (int i = 0 ; i < numbers.length ; i++) {
            for (int j = i + 1 ; j < numbers.length ; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean loopAfterSort(int[] numbers) {
        Arrays.sort(numbers);

        for (int i = 0 ; i < numbers.length - 1 ; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }

        return false;
    }

    boolean usingSort(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int num : numbers) {
            if (numberSet.contains(num)) {
                return true;
            } else {
                numberSet.add(num);
            }
        }

        return false;
    }
}
