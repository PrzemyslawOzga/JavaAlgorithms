/*
Reverse the user-supplied String text using char[].

Example"
Input: Hello world!
Output: !dlrow olleH
*/

package com.company.strings;

import java.util.Scanner;

public class ReverseStringChar {

    public static void reverseString (String stringToReverse) {
        char[] ch = stringToReverse.toCharArray();
        String reverseString = " ";
        for (int i = ch.length - 1; i >= 0; i--) {
            reverseString += ch[i];
        }
        System.out.println(reverseString);
    }

    public static void main(String[] args) {
        System.out.println("Enter text to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String stringToReverse = scanner.nextLine();

        reverseString(stringToReverse);
    }
}
