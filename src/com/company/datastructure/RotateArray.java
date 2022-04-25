package com.company.datastructure;

/*
Problem: Rotate array
Description: Given an array, rotate the array to the right by k steps, where k is non-negative.
Example: Input -> nums = [1,2,3,4,5,6,7], k = 3
         Output -> [5,6,7,1,2,3,4]
*/

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};
        int k1 = 3;
        int k2 = 2;

        RotateArray sol = new RotateArray();
        sol.rotate(nums1, k1);
        sol.rotate(nums2, k2);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
    }
}
