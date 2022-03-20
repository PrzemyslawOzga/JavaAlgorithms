/*
Complexity: O(n^2)
*/

package com.company.sorts;

import java.util.Random;

public class InsertionSort {

    public void insertionSort (int arr[])  {
        int n = arr.length;

        for (int i = 0; i < n; i++ ) {
            int k = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }

    public void printArr(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort ans = new InsertionSort();
        int[] arr = new int[10];
        int n = arr.length;

        Random radndGenerator = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = radndGenerator.nextInt(100) + 1;
        }

        System.out.println("Unsorted list: ");
        ans.printArr(arr);

        long startTime = System.nanoTime();
        ans.insertionSort(arr);
        System.out.println("Sorted list: ");
        ans.printArr(arr);
        System.out.println("Time: " + (System.nanoTime() - startTime));
    }
}
