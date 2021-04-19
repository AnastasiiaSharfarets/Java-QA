package controller;

import java.util.Arrays;

public class ComplexityApp {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 7, 4, 5, 4, 1, 7};
        //O(1)
        int y = arr[1];
        int x = arr[0] + arr[arr.length - 1];

        //O(n)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //sum = sum + arr[i];
            sum += arr[i];
        }

        //O(log n)
        for (int i = 1; i < arr.length; i = i * 2) {
            //sum = sum + arr[i];
            sum += arr[i];
        }

        //O(n*log n)
        // quicksort  mergesort
        Arrays.sort(arr);

        //O(n^2) плохо, чем 23
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //O(n^4+n2+n*log n)
    }
}
