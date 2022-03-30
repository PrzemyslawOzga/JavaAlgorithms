package com.company.datastructure;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Complexity O(n^2)
    public static int[] twoSumList(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    // Complexity O(n)
    public static int[] twoSumHashTable(int [] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        for (Integer ans : twoSumList(nums, target)) {
            System.out.println(ans);
        }

        System.out.println("-------------------");
        for (Integer ans : twoSumHashTable(nums, target)) {
            System.out.println(ans);
        }
    }
}
