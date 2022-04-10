package com.company.maths;

/*
Problem: Palindrome Number: given an integer x/y, return true if x/y is palindrome integer.
Example: Input: x = 121, y = -121
         Output: true, false
*/

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        char[] ch = string.toCharArray();


        int i = 0;
        for (int j = ch.length - 1; j >= 0; j--) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        int x = 1000021; // false
        int y = 121; // true
        int z = 10;  // false
        int a = -121; // false

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
        System.out.println(isPalindrome(z));
        System.out.println(isPalindrome(a));
    }
}
