package com.company.datastructure;

/*
Problem: Roman to Integer
Example: Input: s = "LVIII"
         Output: 58

Example: Input: s = "MCMXCIV"
         Output: 1994
*/

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    // Solution 1 - runtime: 4ms, memory: 42.2mb
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        char temp = 'I';

        for (int i = s.length() - 1; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(temp)) {
                ans -= map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i));
                temp = s.charAt(i);
            }
        }

        return ans;
    }

    // Solution 2 - runtime: 9ms, memory: 46.8mb
    public static int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int i = 0;

        while (i < s.length()) {
            if (i == s.length() - 1 || map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                ans += map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "III";
        String x = "LVIII";
        String y = "MCMXCIV";

        System.out.println(romanToInt(s));
        System.out.println(romanToInt(x));
        System.out.println(romanToInt(y));
        System.out.println();
        System.out.println(romanToInt2(s));
        System.out.println(romanToInt2(x));
        System.out.println(romanToInt2(y));
    }
}
