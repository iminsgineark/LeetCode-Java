package Arrays;

public class MergeTwoSortedLL {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node returnNode = new Node(Integer.MIN_VALUE);
        Node headNode = returnNode;
        while (head1 != null && head2 != null){
            if (head1.data <= head2.data) {
                returnNode.next = head1;
                head1 = head1.next;
            }
            else {
                returnNode.next = head2;
                head2 = head2.next;
            }
            returnNode = returnNode.next;
        }
        if (head1 == null){
            returnNode.next = head2;
        }
        else if (head2 == null){
            returnNode.next = head1;
        }
        return returnNode.next;
    }
    public static void main(String[] args) {

    }
}
