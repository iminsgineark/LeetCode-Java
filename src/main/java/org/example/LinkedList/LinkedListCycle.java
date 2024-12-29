package org.example.LinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
 }

class Solution {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = head.next;
            fast = head.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
public class LinkedListCycle {
    public static void main(String[] args) {

    }
}
