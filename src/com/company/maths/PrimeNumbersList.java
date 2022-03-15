/*
Display all prime numbers from 0 to n number - the number n is entered by the user.

For example:
Input: 20
Output: 2,3,5,7,11,13,17,19
*/

package com.company.maths;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersList {

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        } else if (n < 2 || n % 2 == 0) {
            return false;
        } else {
            for(int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0 ) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printList (int n) {
        ArrayList<Integer> primeList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        System.out.println(primeList);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        printList(n);
    }
}
