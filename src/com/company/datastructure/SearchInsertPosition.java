package com.company.datastructure;

/*
Problem: Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int indexLow = 0;
        int indexHigh = nums.length - 1;

        while (indexLow <= indexHigh) {
            int indexMid = (indexLow + indexHigh) / 2;

            if (nums[indexMid] == target) {
                return indexMid;
            } else if (target > nums[indexMid]) {
                indexLow = indexMid + 1;
            } else if (target < nums[indexMid]) {
                indexHigh = indexMid - 1;
            }
        }
        return indexLow;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target1 = 9;

        System.out.println(searchInsert(nums, target1));
    }
}
