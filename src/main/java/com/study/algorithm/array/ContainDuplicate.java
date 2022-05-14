package com.study.algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    boolean nestedLoop(int[] numbers) {
        for (int i = 0 ; i < numbers.length ; i++) {
            for (int j = i + 1 ; j < numbers.length ; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean loopAfterSort(int[] numbers) {
        // https://www.baeldung.com/arrays-sortobject-vs-sortint
        Arrays.sort(numbers); //Dual-Pivot Quicksort -> NlogN

        for (int i = 0 ; i < numbers.length - 1 ; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }

        return false;
    }

    boolean usingSet(int[] numbers) {
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
