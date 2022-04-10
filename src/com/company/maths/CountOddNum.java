package com.company.maths;

/*
Problem: Count Odd Numbers in an Interval Range
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
*/

public class CountOddNum {

    public static int countOdds1(int low, int high) {
        int mid = (high - low) / 2;
        if (low % 2 != 0 || high % 2 != 0) {
            mid++;
        }

        return mid;
    }

    public static int countOdds2(int low, int high) {
        int numOfOddNumbers = 0;
        if (low % 2 == 0) {
            low++;
        }

        for (int i = low; i <= high; i += 2) {
            numOfOddNumbers++;
        }

        return numOfOddNumbers;
    }

    public static void main(String[] args) {
        int low1 = 3, high1 = 7;
        int low2 = 8, high2 = 10;

        System.out.println(countOdds1(low1, high1));
        System.out.println(countOdds1(low2, high2));
        System.out.println();
        System.out.println(countOdds2(low1, high1));
        System.out.println(countOdds2(low2, high2));
    }
}