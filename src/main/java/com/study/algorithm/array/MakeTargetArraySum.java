package com.study.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class MakeTargetArraySum {

    //[Nested Loop] T: O(n2) S: O(1)
    int[] nestedLoop(int[] numbers, int target) { // T: O(n2) S: O(1)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    /*
     * 중복 되지 않는다고 했으므로 찾으려는 숫자를 키로 활용 -> 시간 복잡도 줄일 수 있다.
     * key = 주어진 숫자, value = 인덱스
     *
     * Numbers Loop를 돌며 대상 숫자가 있는지 찾는다. 단 자기 자신은 피한다.
     * */
    int[] usingMap1(int[] numbers, int target) { // T: O(n) S: O(n)
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i) { // 자기 자신이 답이 될 수 있으므로 인덱스에서 제외
                return new int[]{i, numberMap.get(numberToFind)};
            }
        }

        return null;
    }

    int[] usingMap(int[] numbers, int target) { // T: O(n) S: O(n)
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i) { // 자기 자신이 답이 될 수 있으므로 인덱스에서 제외
                return new int[]{i, numberMap.get(numberToFind)};
            }

            numberMap.put(numbers[i], i);
        }

        return null;
    }


}
