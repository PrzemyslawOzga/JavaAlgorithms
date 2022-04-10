package com.company.datastructure;

/*
Problem: Valid Parentheses
         Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
         An input string is valid if:
            - Open brackets must be closed by the same type of brackets.
            - Open brackets must be closed in the correct order.

Example: Input: Input: s = "()[]{}"
         Output: true
*/

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "([)]";
        String s3 = "([}}])";
        String s4 = "()[]([[]])";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }
}
