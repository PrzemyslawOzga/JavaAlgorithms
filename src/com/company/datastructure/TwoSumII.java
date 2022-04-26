package com.company.datastructure;

/*
Problem: Two Sum II - Input Array Is Sorted
Description: Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find
two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and
numbers[index2] where 1 <= index1 < index2 <= numbers.length.
*/

public class TwoSumII {
    // Complexity O(n^2)
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }

        return null;
    }

    // Complexity O(log n)
    public static int[] twoSum2(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                break;
            } else if (numbers[start] + numbers[end] < target)  {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {start + 1, end + 1};
    }
}
