package com.company.maths;

import java.util.Arrays;
import java.util.Random;

public class FindAbsoluteMaxNum {

    public static int absMax(int[] arr) {
        int n = arr.length;
        int maxValue = arr[0];
        for (int i = 1; i < n; ++i) {
            if (Math.abs(arr[i]) > Math.abs(maxValue)) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = arr.length;

        Random radndGenerator = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = radndGenerator.nextInt(100) + 1;
        }

        System.out.println(arr);
        System.out.println("absMax(" + Arrays.toString(arr) + ") = " + absMax(arr));    }
}
