/*
Reverse String text using StringBuffer.

Example:
Input: Hello world!
Output: !dlrow olleH
*/

package com.company.strings;

public class ReverseStringBuffer {

    public static void main(String[] args) {
        StringBuffer sB = new StringBuffer("Java");
        System.out.println("String: " + sB);

        long startTime = System.nanoTime();
        StringBuffer reverseString = sB.reverse();

        System.out.println("Reverse String: " + reverseString);
        System.out.println("Time: " + (System.nanoTime() - startTime));
    }
}
