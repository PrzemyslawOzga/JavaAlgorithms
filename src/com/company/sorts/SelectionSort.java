/*
Complexity: O(n^2)
*/

package com.company.sorts;

import java.util.Random;

public class SelectionSort {

    public void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void printArr(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort ans = new SelectionSort();
        int[] arr = new int[10];
        int n = arr.length;

        Random radndGenerator = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = radndGenerator.nextInt(100) + 1;
        }

        System.out.println("Unsorted list: ");
        ans.printArr(arr);

        long startTime = System.nanoTime();
        ans.selectionSort(arr);
        System.out.println("Sorted list: ");
        ans.printArr(arr);
        System.out.println("Time: " + (System.nanoTime() - startTime));
    }
}
