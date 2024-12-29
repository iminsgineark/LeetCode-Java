package org.example.LinkedList;

class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
  }
class Solution1 {
    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 head = null;
        ListNode1 temp = null;
        int carry = 0;
        while (l1 != null || l2!=null || carry != 0) {
            int val1;
            if (l1 == null) {
                val1 = 0;
            }else {
                val1 = l1.val;
            }
            int val2;
            if (l1 == null) {
                val2 = 0;
            }else {
                val2 = l2.val;
            }
            int value = val1 + val2 + carry;

            ListNode1 newNode = new ListNode1(value%10);
            carry = value/10;

            if (head == null) {
                head = newNode;
                temp = newNode;
            }else {
                temp.next = newNode;
                temp = temp.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {

    }
}
