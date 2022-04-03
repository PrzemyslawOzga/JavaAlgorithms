package com.company.strings;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        char ch[] = haystack.toCharArray();

        for (int i = 0; i < ch.length ; i++)  {
            System.out.println(ch[i]);
        }

        return 0;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String haestack1 = "aaaaa";
        String needle = "ll";
        String needle1 = "bba";

        strStr(haystack, needle);
    }
}
