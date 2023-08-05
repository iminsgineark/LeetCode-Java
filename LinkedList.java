class LL2{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int val){
        if (head == null){
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int val){
        if (head == null){
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
        Node prevNode = null;
        int count = 1;
        if (count < pos - 1){
            prevNode = currNode;
            currNode = currNode.next;
        }
        Node newNode = new Node(val);
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    public int deleteFirst(){
        if (isEmpty()){
            throw new RuntimeException();
        }
        Node currNode = head;
        head = head.next;
        currNode.next = null;
        return currNode.val;
    }
    public int deleteAtLast(){
        if (isEmpty()){
            throw new RuntimeException();
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
    public int deleteAtIndex(int pos){
        if (isEmpty()){
            throw new RuntimeException();
        }
        if (pos == 1){
            deleteAtLast();
        }
        Node currNode = head;
        Node prvNode = null;
        int count = 1;
        while (count < pos){
            count++;
            prvNode = currNode;
            currNode = currNode.next;
        }
        prvNode.next = currNode.next;
        currNode.next = null;
        return currNode.val;
    }
    public boolean search(int val){
        Node currNode = head;
        while (currNode != null){
            if (val == currNode.val){
                return true;
            }
        }
        return false;
    }
    public void display(){
        Node currNode = head;
        System.out.print("Start ->");
        while (currNode != null){
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.print("End");
    }
}
public class Rough3 {
    public static void main(String[] args) {
        LL2 ll = new LL2();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        ll.addAtIndex(3,8);
        ll.display();
        System.out.println("\n");
        ll.deleteAtIndex(3);
        ll.display();
    }
}
