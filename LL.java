package Arrays;
 
public class LL {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    public void addFirst(int val){
        if (isEmpty()){
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int val){
        if (isEmpty()){
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }
    public void addAtIndex(int pos,int val){
        if (pos == 1){
            addFirst(val);
            return;
        }
        Node currNode = head;
        int count = 1;
        while (count < pos - 1){
            count++;
            currNode = currNode.next;
        }
        Node newNode = new Node(val);
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int deleteAtFirst(){
        if (isEmpty()){
            throw new RuntimeException("List Is Empty");
        }
        Node currNode = head;
        head = head.next;
        currNode.next = null;
        return currNode.val;
    }
    public int deleteLast(){
        if (isEmpty()){
            throw new RuntimeException("List Is Empty");
        }
        Node currNode = head;
        Node prevNode = null;
        while (currNode.next != null){
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        tail = prevNode;
        return currNode.val;
    }
    public  int deleteAtIndex(int pos){
        if (isEmpty()){
            throw new RuntimeException("List Is Empty");
        }
        if (pos == 1){
            deleteAtFirst();
        }
        Node currNode = head;
        Node prevNode = null;
        int count = 1;
        while (count < pos){
            count++;
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = currNode.next;
        currNode.next = null;
        return currNode.val;
    }
    public boolean search(int val){
        Node currNode = head;
        while (currNode != null){
            if (val == currNode.val){
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
    public void PrintList(){
        Node currNode = head;
        System.out.print("Start ->");
        while (currNode != null){
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.print(" END");
    }
    public void reverseLinkedList(){
        if (head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        ll.addAtIndex(3,8);
        ll.PrintList();
        System.out.println("\n");
        ll.deleteAtFirst();
        ll.PrintList();
        System.out.println("\n");
        ll.deleteLast();
        ll.PrintList();
        System.out.println("\n");
        ll.reverseLinkedList();
        ll.PrintList();
    }
}
