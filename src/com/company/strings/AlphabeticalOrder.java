/*
Alphabetical order is a system whereby character strings are placed in order based on the position
of the characters in the conventional ordering of an alphabet.
Wiki: https://en.wikipedia.org/wiki/Alphabetical_order
*/

package com.company.strings;

public class AlphabeticalOrder {

    public static boolean checkAlphabetical(String alphabet) {
        alphabet = alphabet.toLowerCase();
        for (int i = 0; i < alphabet.length() - 1; ++i) {
            if (!Character.isLetter(alphabet.charAt(i)) || !(alphabet.charAt(i) <= alphabet.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        assert !checkAlphabetical("123abc");
        assert !checkAlphabetical("xyzabc");
        assert checkAlphabetical("aBC");
        assert checkAlphabetical("abc");
        assert checkAlphabetical("abcxyz");

        String a1 = "123";
        String a2 = "abc";
        String a3 = "abc1def";
        System.out.println(checkAlphabetical(a1)); // false
        System.out.println(checkAlphabetical(a2)); // true
        System.out.println(checkAlphabetical(a3)); // false
    }
}
