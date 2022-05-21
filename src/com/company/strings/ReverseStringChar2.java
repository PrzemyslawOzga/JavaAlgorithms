package com.company.strings;

public class ReverseStringChar2 {
    public static void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while(start < end) {
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
        System.out.println(s);
    }
}
