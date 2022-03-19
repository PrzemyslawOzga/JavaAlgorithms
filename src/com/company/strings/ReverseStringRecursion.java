/*
Reverse the user-supplied String text using recursion.

Example"
Input: Hello world!
Output: !dlrow olleH
*/

package com.company.strings;

public class ReverseStringRecursion {

    String reverseString (String stringToReverse) {
        if (stringToReverse.length() == 0) {
            return " ";
        } else {
            return stringToReverse.charAt(stringToReverse.length() - 1)
                    + reverseString(stringToReverse.substring(0, stringToReverse.length() - 1));
        }
    }

    public static void main(String[] args) {
        ReverseStringRecursion reverseString = new ReverseStringRecursion();
        String stringToReverse = "Hello world!";
        System.out.println(reverseString.reverseString(stringToReverse));
    }
}
