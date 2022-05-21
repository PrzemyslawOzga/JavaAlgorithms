package com.company.strings;

/*
Problem: Reverse Words in a String III
Description: Given a string s, reverse the order of characters in each
word within a sentence while still preserving whitespace and initial word order.
*/

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        for (;j<c.length;j++) {
            if (c[j] == ' ') {
                reverseWord(c, i, j-1);
                i = j+1;
            }
        }
        reverseWord(c, i, j-1);
        return new String(c);
    }

    private void reverseWord(char[] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }
}
