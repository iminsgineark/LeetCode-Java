package org.example;

class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void insertAtIndex(int val, int pos) {
        if (pos == 0) {
            insertFirst(val);
            return;
        } else if (pos == size) {
            insertLast(val);
            return;
        }else {
            Node temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            Node nd = new Node(val,temp.next);
            temp.next = nd;
            size++;
        }
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int deleteAtIndex(int index){
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        }else {
            Node prev = get(index - 1);
            int val = prev.next.value;
            prev.next = prev.next.next;
            return val;
        }
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print (temp.value + "->");
            temp = temp.next;
        }
        System.out.print("End");
    }


    public void insertLast(int val){

        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }
    class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }



    }
}


public class LinkedlistImp {
    public static void main(String[] args) {
         LL ls = new LL();
         ls.insertFirst(1);
         ls.insertFirst(2);
        ls.insertFirst(3);
        ls.insertFirst(4);
        ls.insertFirst(5);
        ls.insertLast(21);
        ls.insertFirst(211);
        ls.insertAtIndex(89,2);
        System.out.println(ls.deleteFirst());
        System.out.println(ls.deleteAtIndex(4));
        ls.display();
    }
}