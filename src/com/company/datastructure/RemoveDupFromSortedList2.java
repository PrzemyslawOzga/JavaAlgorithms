package com.company.datastructure;

/*
Problem: Remove Duplicates from Sorted List
Description: Given the head of a sorted linked list, delete all duplicates such that each element appears
only once. Return the linked list sorted as well.
No. leetcode: 83
*/

public class RemoveDupFromSortedList2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
  }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == pre.val){
                pre.next = cur.next;
                cur = cur.next;
            }
            else{
                pre = pre.next;
                cur = pre.next;
            }
        }
        return head;
    }
}
