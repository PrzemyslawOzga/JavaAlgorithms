/*
Complexity: O(n log n)
*/

package com.company.sorts;

import java.util.Arrays;
import java.util.Random;

public class RadixSort {

    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void radixSort(int arr[], int n)  {
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = arr.length;

        Random radndGenerator = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = radndGenerator.nextInt(100) + 1;
        }

        System.out.println("Unsorted array: ");
        printArr(arr, n);

        long startTime = System.nanoTime();
        radixSort(arr, n);
        System.out.println("Sorted array: ");
        printArr(arr, n);
        System.out.println("Time: " + (System.nanoTime() - startTime));
    }
}
