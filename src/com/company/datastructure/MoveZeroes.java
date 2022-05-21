package com.company.datastructure;

/*
Problem: move zeroes
Description: given an array nums[], move all 0's to the end of it while maintaining the relative
order of the non-zero elements. Note that you must do thin in-place without making a copy of the array.
*/

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = -1;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (tmp != 0) {
                n++;
                nums[i] = nums[n];
                nums[n] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};

        moveZeroes(nums1);
        moveZeroes(nums2);
     }
}
