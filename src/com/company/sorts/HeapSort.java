/*
Complexity: O(n log n)
*/

package com.company.sorts;

import java.util.Random;

public class HeapSort {

    public void heapSort (int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heap(arr, i, 0);
        }
    }

    public void heap(int arr[], int n, int i) {
        int largestRoot = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largestRoot]) {
            largestRoot = l;
        }

        if (r < n && arr[r] > arr[largestRoot]) {
            largestRoot = r;
        }

        if (largestRoot != i) {
            int swap = arr[i];
            arr[i] = arr[largestRoot];
            arr[largestRoot] = swap;

            heap(arr, n, largestRoot);
        }
    }

    static void printArr(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort ans = new HeapSort();
        int[] arr = new int[10];
        int n = arr.length;

        Random radndGenerator = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = radndGenerator.nextInt(100) + 1;
        }

        System.out.println("Unsorted list: ");
        ans.printArr(arr);

        long startTime = System.nanoTime();
        ans.heapSort(arr);
        System.out.println("Sorted list: ");
        ans.printArr(arr);
        System.out.println("Time: " + (System.nanoTime() - startTime));
    }
}
