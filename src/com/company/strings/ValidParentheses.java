package com.company.strings;

/*
Problem: Valid Parentheses
         Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
         An input string is valid if:
            - Open brackets must be closed by the same type of brackets.
            - Open brackets must be closed in the correct order.

Example: Input: Input: s = "()[]{}"
         Output: true

         IN PROGRESS
*/

import java.util.HashSet;

public class ValidParentheses {

    public static boolean isValid(String s) {
        HashSet<String> set = new HashSet<>();
        set.add("()");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i)) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));

    }
}
