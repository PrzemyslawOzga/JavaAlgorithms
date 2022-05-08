package com.company.others;

/*
Problem: Nim Game
You are playing the following Nim Game with your friend:
    - Initially, there is a heap of stones on the table.
    - You and your friend will alternate taking turns, and you go first.
    - On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
    - The one who removes the last stone is the winner.
Given n, the number of stones in the heap, return true if you can win the game assuming both you and your
friend play optimally, otherwise return false.
*/

public class NimGame {
    public static boolean canWinNim(int n) {
        if (n % 4 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 123, n2 = 3, n3 = 4, n4 = 5;
        System.out.println(canWinNim(n1));
        System.out.println(canWinNim(n2));
        System.out.println(canWinNim(n3));
        System.out.println(canWinNim(n4));
    }
}
