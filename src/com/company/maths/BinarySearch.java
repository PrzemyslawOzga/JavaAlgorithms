package com.company.maths;

/*
Problem: LeetCode #704 -> Binary search
Description: Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
*/

public class BinarySearch {
    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;
        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 12;

        System.out.println(search(nums1, target1));
        System.out.println(search(nums2, target2));
    }
}
