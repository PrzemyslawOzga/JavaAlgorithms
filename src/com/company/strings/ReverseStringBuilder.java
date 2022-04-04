/*
Reverse String text using StringBuilder.

Example:
Input: Hello world!
Output: !dlrow olleH
*/

package com.company.strings;

public class ReverseStringBuilder {

    public static StringBuilder reverseStringBuilder (StringBuilder stringToReverse) {
        StringBuilder reverseString = stringToReverse.reverse();
        return reverseString;
    }

    public static void main(String[] args) {
        StringBuilder sB = new StringBuilder("Java");
        System.out.println("String to reverse: " + sB);

        long startTime = System.nanoTime();
        System.out.println("Reverse string: " + reverseStringBuilder(sB));;
        System.out.println("Time: " + (System.nanoTime() - startTime));
    }
}
