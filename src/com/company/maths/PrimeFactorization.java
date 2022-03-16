/*
Factorize the number entered by the user.

Example:
Input: 30
Output: 2,3,5 // 2*3*5==30
*/

package com.company.maths;

import java.util.Scanner;

public class PrimeFactorization {

    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.println(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Printing factors of " + n + ": ");
        primeFactors(n);
        scanner.close();
    }
}
