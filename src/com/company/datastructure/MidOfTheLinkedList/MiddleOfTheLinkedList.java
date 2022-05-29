package com.company.datastructure.MidOfTheLinkedList;

/*
Problem: Middle of the Linked List
Description: Given the head of a singly linked list,
             return the middle node of the linked list.
             If there are two middle nodes, return the
             second middle node.
*/

import java.util.LinkedList;

class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return head;
        }

        int len = 0;
        ListNode current = head;
        while(current != null) {
            len++;
            current = current.next;
        }

        len /= 2;
        current = head;
        while(len > 0) {
            current = current.next;
            len--;
        }

        return current;
    }
}
