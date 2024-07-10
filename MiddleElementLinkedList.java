package Arrays;
class ListNodeLL {
     int val;
     ListNodeLL next;
    ListNodeLL() {}
    ListNodeLL(int val) { this.val = val; }
    ListNodeLL(int val, ListNodeLL next) { this.val = val; this.next = next; }
}

class MiddleElementLinkedList {
    public ListNodeLL middleNode(ListNodeLL head) {
        ListNodeLL slow = head;
        ListNodeLL fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}