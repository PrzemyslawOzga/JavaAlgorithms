package com.company.maths;

/*
Interview task
Problem: create a program that returns the sum of the multiplication of two integers without using the
         multiplication sign.
*/

public class MultiplyTwoInt {
    public static int multiply(int x, int y) {
        int sum = 0;
        for (int i = 0; i < Math.abs(y); i++) {
            sum = sum + x;
        }

        if (x < 0 && y < 0 || x > 0 && y < 0) {
            return -sum;
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {
        int x = 5, y = -3;

        System.out.println(multiply(x, y));
    }
}
