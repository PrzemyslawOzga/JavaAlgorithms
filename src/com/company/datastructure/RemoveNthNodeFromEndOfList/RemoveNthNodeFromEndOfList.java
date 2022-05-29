package com.company.datastructure.RemoveNthNodeFromEndOfList;

/*
Problem: Remove Nth Node From End of List
Description: Given the head of a linked list, remove the nth
             node from the end of the list and return its head.
*/

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode voidHead = new ListNode(-1);
        voidHead.next = head;
        ListNode p1 = voidHead;
        ListNode p2 = voidHead;

        while (p1.next != null) {
            p1 = p1.next;
            if (n-- <= 0) {
                p2 = p2.next;
            }
        }

        if (p2.next != null) {
            p2.next = p2.next.next;
        }

        return voidHead.next;
    }
}
