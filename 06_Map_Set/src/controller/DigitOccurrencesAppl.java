package controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DigitOccurrencesAppl {
    public static void main(String[] args) {
        Map<Integer, Integer> digitsMap = new HashMap<>();
        //()->{code;}
        int[] randomArr = fillArray(1000, 0, 9);
        //[0][2][0][0][2][9][7]
//        key   value
//        [0]    [2]
//        [2]    [2]
//        [3]    [1]
//        ...
//        [9]     [100]
        System.out.println(Arrays.toString(randomArr));
        for (int i = 0; i < randomArr.length; i++) {
            //  addNewOccurrence(digitsMap, randomArr[i]);
            //a - current value
            //b - new value
            digitsMap.merge(randomArr[i], 1, (a, b) -> a + b);
        }

        System.out.println(Arrays.toString(digitsMap.entrySet().toArray()));
    }

    private static void addNewOccurrence(Map<Integer, Integer> digitsMap, int digit) {
        Integer newValue;
        Integer oldValue = digitsMap.get(digit);
        if (oldValue == null) {
            newValue = 1;
        } else {
            newValue = oldValue + 1;
        }
        digitsMap.put(digit, newValue);
    }

    private static int[] fillArray(int length, int min, int max) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = (int) (min + Math.random() * (max + 1 - min));
        }
        return res;
    }
}
