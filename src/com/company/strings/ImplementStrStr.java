package com.company.strings;


public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        } else if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)){
                String substring = haystack.substring(i, i + needle.length());
                if (substring.equals(needle))
                    return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        String haystack1 = "mississippi";
        String needle1 = "issip";

        System.out.println(strStr(haystack, needle));
        System.out.println(strStr(haystack1, needle1));
    }
}
