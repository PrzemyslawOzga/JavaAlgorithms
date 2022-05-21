package com.company.maths;

/*
Problem: Squares of a sorted array
Description: Given an integer array nums sorted in non-decreasing order, return an array of the
squares of each number sorted in non-decreasing order.
*/

import java.util.Arrays;

public class SquaresOfSortedArray1 {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int square = nums[i] * nums[i];
            nums[i] = square;
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {-4,-1,0,3,10};
        int[] nums2 = {-7,-3,2,3,11};

        sortedSquares(nums1);
        sortedSquares(nums2);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

        System.out.println();
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums2[i]);
        }
    }
}
