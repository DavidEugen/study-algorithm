package com.study.algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

public class ContainDuplicate {

    //[Nested loop] T: O(n2) S: O(1)
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


    //[Loop After Sort] - T: O(NlogN) S: O(logN)
    //Arrays.sort 의 경우 NlogN
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

    // [Using Set] T: O(N) S: O(N)

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
    /*
    처음에는 Set에 넣고 배열 lengthd와 Set의 length를 비교해 보려 했으나
    이는 이미 loop를 한번 완전히 돌아야 하고
    Contains는 중간에 바로 quit 할 수 있다.
    */
}
