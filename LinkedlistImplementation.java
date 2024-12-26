class Node {
    int value; 
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
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

    public void insertLast(int val) {
	    
	    if(tail == null){
		    insertFirst(val);
		    return;
	    }
	    
	    Node node = new Node(val);
	    node.next = tail;
	    tail=node;
	    size+=1;
    }

    public void insertAtIndex(int val, int pos){
	    if (pos == 0){
		    insertFirst(val);
		    return;
	    }else if (pos==size){
		    insertLast(val);
		    return;
	    }else{
		    Node temp = head;
		    for(int i = 1;i < pos; i++){
			    temp = temp.next;
		    }
		    Node nd = new Node(val, temp.next);
		    temp.next = nd;
		    size++;
	    }
    }
    public int deleteFirst(){
	    int val = head.value;
	    head = head.next;
	    if(head == null){
		    tail = null;
	    }
	    size--;
	    return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public int getSize() {
        return size;
    }
}

public class LinkedlistImplementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
	list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
	list.insertLast(32);
	list.insertFirst(33);
	list.insertAtIndex(87,2);
        list.display(); 
    }
}

