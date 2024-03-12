package Arrays;

public class reverseLinkedList {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void reverseLinkedList(node head){
        if (head == null){
            return;
        }
        reverseLinkedList(head.next);
        System.out.print(head.data + " ");
    }
    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        reverseLinkedList(head);
    }
}
