package com.company.maths;

/*
Problem: Squares of a Sorted Array
Description: Given an integer array nums sorted in non-decreasing order, return an
array of the squares of each number sorted in non-decreasing order.
*/

public class SquaresOfSortedArray2 {
    public static int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (k >= 0) {
            if (Math.abs (nums[i]) > Math.abs (nums[j])) {
                answer[k--] = nums[i] * nums[i++];
            } else {
                answer[k--] = nums[j] * nums[j--];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(sortedSquares(nums)[i]);
        }
    }
}
