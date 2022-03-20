package com.company.sorts;

import java.util.Random;

public class BubbleSort {

    public void bubbleSort(int arr[]) {
        int sizeOfArray = arr.length;

        for (int i = 0; i < sizeOfArray - 1; i++) {
            for (int j = 0; j < sizeOfArray - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printArr(int arr[]) {
        int sizeOfArray = arr.length;
        for (int i = 0; i < sizeOfArray; i++ ) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ans = new BubbleSort();
        int[] arr = new int[10];

        Random radndGenerator = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = radndGenerator.nextInt(100) + 1;
        }

        System.out.println("Unsorted list: ");
        ans.printArr(arr);
        ans.bubbleSort(arr);
        System.out.println("Sorted list: ");
        ans.printArr(arr);
    }
}
