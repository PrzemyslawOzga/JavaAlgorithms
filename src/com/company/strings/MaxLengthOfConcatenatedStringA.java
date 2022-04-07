package com.company.strings;

/*
Problem: Maximum Length of a Concatenated String - Letcode #1239
Example: Input: arr = ["un","iq","ue"]
         Output: 4

Using: Array<String>
*/

import java.util.ArrayList;

public class MaxLengthOfConcatenatedStringA {
    public static int maxLength(ArrayList<String> arr) {
        int[] result = new int[1];
        getMaxLength(0, arr, "", result);
        return result[0];
    }

    public static void getMaxLength(int i, ArrayList<String> arr, String currentStr, int[] maxLength) {
        if (i == arr.size()) {
            if (uniqueCharCount(currentStr) > maxLength[0]) {
                maxLength[0] = currentStr.length();
            }
            return;
        }
        getMaxLength(i + 1, arr, currentStr + arr.get(i), maxLength);
        getMaxLength(i + 1, arr, currentStr, maxLength);
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
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cod");
        arrayList.add("il");
        arrayList.add("ity");

        System.out.println(maxLength(arrayList));
    }
}
