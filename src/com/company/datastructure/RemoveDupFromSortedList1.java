package com.company.datastructure;

/*
Problem: Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.
*/

import java.util.LinkedList;

public class RemoveDupFromSortedList1 {

    public static LinkedList deleteDuplicates(LinkedList<Integer> head) {
        if (head.isEmpty()) return null;
        for (int i = 0; i < head.size(); i++) {
            if (head.get(i) == head.get(i + 1)) {
                head.remove(i);
            }
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(3);

        System.out.println(deleteDuplicates(head));
    }
}
