/*
Reverse String text using StringBuilder.

Example:
Input: Hello world!
Output: !dlrow olleH
*/

package com.company.strings;

public class ReverseStringBuilder {

    public static void main(String[] args) {
        StringBuilder sB = new StringBuilder("Java");
        System.out.println("String: " + sB);

        long startTime = System.nanoTime();
        StringBuilder reverseString = sB.reverse();

        System.out.println("Reverse String: " + reverseString);
        System.out.println("Time: " + (System.nanoTime() - startTime));
    }
}
