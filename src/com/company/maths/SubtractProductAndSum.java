package com.company.maths;

/*
Problem: Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
*/

public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int tmp = n % 10;
            sum += tmp;
            product *= tmp;
            n = n/10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        int n1 = 234;
        int n2 = 4421;
        int n3 = 1;

        System.out.println(subtractProductAndSum(n1));
        System.out.println(subtractProductAndSum(n2));
        System.out.println(subtractProductAndSum(n3));
    }
}
