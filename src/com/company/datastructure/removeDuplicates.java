package com.company.datastructure;

/*
Problem: Remove Duplicates from Sorted Array
Example: Input: nums = [1,1,2]
         Output: 2, nums = [1,2,_]
*/

public class removeDuplicates {

    // Complexity: O(n)
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums1 = {1,1,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        System.out.println();
        System.out.println(removeDuplicates(nums1));
    }
}
