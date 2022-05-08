package com.company.others;

/*
Problem: Number of Steps to Reduce a Number to Zero
Description: Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise,
you have to subtract 1 from it.
*/

public class NumOfStepsToReduceNumToZero {
    public static int numberOfSteps(int num) {
        int steps = 0;
        if (num == 1) { return 1; }
        if (num == 0) { return 0; }

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            } else if (num % 2 != 0) {
                num = num - 1;
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        int num1 = 14, num2 = 2, num3 = 123;

        System.out.println(numberOfSteps(num1));
        System.out.println(numberOfSteps(num2));
        System.out.println(numberOfSteps(num3));
    }
}
