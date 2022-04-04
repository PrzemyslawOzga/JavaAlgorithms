package com.company.maths;

/*
Interview task
Problem: create a program that returns the sum of the multiplication of two integers without using the
         multiplication sign.
*/

public class MultiplyTwoInt {
    public static int sum(int x, int y) {
        int sum = 0;
        for (int i = 0; i < Math.abs(y); i++) {
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x = 5, y = -3;

        if (x < 0 && y < 0) {
            int res = -sum(x, y);
            System.out.println(res);
        } else if (x > 0 && y < 0) {
            int res = -sum(x, y);
            System.out.println(res);
        } else {
            int res = sum(x, y);
            System.out.println(res);
        }
    }
}
