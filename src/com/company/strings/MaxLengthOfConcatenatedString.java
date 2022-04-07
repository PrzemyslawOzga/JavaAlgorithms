package com.company.strings;

/*
Problem: Maximum Length of a Concatenated String - Letcode #1239
Example: Input: arr = ["un","iq","ue"]
         Output: 4
*/

public class MaxLengthOfConcatenatedString {
    public static int maxLength(String[] A) {
        int[] result = new int[1];
        getMaxLength(0, A, "", result);
        return result[0];
    }

    public static void getMaxLength(int i, String[] A, String currentStr, int[] maxLength) {
        if (i == A.length) {
            if (uniqueCharCount(currentStr) > maxLength[0]) {
                maxLength[0] = currentStr.length();
            }
            return;
        }
        getMaxLength(i + 1, A, currentStr + A[i], maxLength);
        getMaxLength(i + 1, A, currentStr, maxLength);
    }

    public static int uniqueCharCount(String currentString) {
        int[] count = new int[26];
        for (char c : currentString.toCharArray()) {
            if (count[c - 'a']++ > 0) {
                return -1;
            }
        }
        return currentString.length();
    }

    public static void main(String[] args) {
        String[] A = {"co", "di", "lity"};
        String[] A2 = {"aaaaaaa", "bbbbbbb", "ccccccc"};
        String[] A3 = {"abcdefghi"};

        System.out.println(maxLength(A));
        System.out.println(maxLength(A2));
        System.out.println(maxLength(A3));
    }
}
