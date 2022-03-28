package com.company.maths;

import java.math.BigInteger;

public class MyltiplyTwoInt {
    // #1
    public static BigInteger myltiply2Integers(int a, int b) {
        if (b < a) {
            int temp = a;
            b = a;
            a = temp;
        }

        BigInteger num = BigInteger.valueOf(a);
        for( int i = 1; i < Math.abs(b); i++ ) {
            num = num.add(BigInteger.valueOf(a));
        }
        return num;
    }

    // #2
    public static int sum (int x, int y) {
        int sum = 0;
        for (int i = 0; i < Math.abs(y); i++) {
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // myltiply2Integers
        int a = 3, b = -5;
        BigInteger num = myltiply2Integers(a, b);
        System.out.println(num);

        // sum
        int x = 5, y = -3;
        if (x < 0 && y < 0) {
            int res = sum(x, y) * (-1);
            System.out.println(res);
        } else if (x > 0 && y < 0) {
            int res = sum(x, y) * (-1);
            System.out.println(res);
        } else {
            int res = sum(x, y);
            System.out.println(res);
        }
    }
}
