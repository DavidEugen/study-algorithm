package com.study.algorithm.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BigONotation {
    /**
     * List를 만들고 배열에 있는 숫자를 순회하면서 해당 숫자가 List에 들어있는지 확인한다.
     * 시간 복잡도 공간 복잡도 설명하기 위한 예제 (완벽하지 않음), 조건에 따라 결과가 달라질 수 있음.
     * 조건 :
     *   1. 중복은 짝수개만 가능
     *   2. 처음 등장하는 유일한값
     * List에 들어있으면 List에서 빼내고, 없으면 넣는다.
     * 그럼 결과적으로 List에는 유일한 숫자만 들어있으니 해당 숫자를 꺼내서 리턴한다.
     *
     * 시간 복잡도: O(n) * O(n) => O(n²)
     * 공간 복잡도: O(n)
     */
    int findWithList(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) { //O(n)
            if (list.contains(num)) { // forLoop 이 들어 있으므로 O(n)
                list.remove((Integer) num);
            } else {
                list.add(num);
            }
        }

        return list.get(0);
    }

    /**
     * HashMap을 사용해서 배열에 들어있는 숫자를 키, 숫자의 등장 횟수를 값으로 저장한다.
     * 숫자의 등장 횟수가 1인 키값을 찾아서 리턴한다.
     *
     * 시간 복잡도: O(n) + O(n) => O(2n) => O(n)
     * 공간 복잡도: O(n)
     */
    int findWithHashMap(int[] numbers) {
        HashMap<Integer, Integer> numbersMap = new HashMap<>(); //key : targetNumber, value : count

        for (int num : numbers) {
            numbersMap.put(num, numbersMap.getOrDefault(num, 0) + 1);
        }

        for (int num : numbers) {
            if (numbersMap.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }

    /**
     * XOR 비트 연산자 (^)를 사용하는 방법
     * XOR 비트 연산자: 두 비트가 서로 다를 때 1
     * 빅오 설명하기 위함. 완벽하지 않음
     * 5 ^ 0 = 5

     * 시간 복잡도: O(n)
     * 공간 복잡도: O(1)
     *
     */
    int findWithBitOperation(int[] numbers) {
        int uniqueNum = 0;
        for (int num : numbers) {
            uniqueNum ^= num;
        }
        return uniqueNum;
    }
}
