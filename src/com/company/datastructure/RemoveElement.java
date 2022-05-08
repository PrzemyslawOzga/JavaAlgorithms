package com.company.datastructure;

/*
Problem: Remove Element
Example: Input: nums = [0,1,2,2,3,0,4,2], val = 2
         Output: 5, nums = [0,1,4,0,3,_,_,_]
*/

public class RemoveElement {

    // Complexity: O(n)
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int[] nums1 = {3,2,2,3};
        int val1 = 3;

        System.out.println(removeElement(nums, val));

    }
}
