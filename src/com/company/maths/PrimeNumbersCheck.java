/*
Check that the number n entered by the user is a prime number and print the correctly message.

For example:
Input: 7
Output: 7 is a prime number
*/

package com.company.maths;

import java.util.Scanner;

public class PrimeNumbersCheck {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n < 2 || n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime numbers");
        } else {
            System.out.println(n + " is not a prime numbers");
        }
        scanner.close();
    }
}
