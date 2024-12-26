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

class LL {
	private Node head;
	private Node tail;
	private int ll;

	public LL(){
		this.size = 0;
	}

	public void inserrAtFirst(int val){
		if(tail == null){
			tail = head;
			return;
		}
		Node nd = new Node(val);
		nd.next = head;
		head = node;

		size+=1;
	}
	public void insertAtLast(int val){
		if (tail == null){
			insertAtFirst(val);
			return;
		}
		Node nd = new Node(val);
		nd.next = tail;
		tail = node;
	}
	public void insertAtIndex(int val, int pos){
		if (pos == 0){
			insertFirst(val);
			return;
		}else if(pos == size){
			insertLast(val);
			return;
		}else{
			Node temp = head;
			for(int i = 0;i<pos;i++){
				temp = temp.next;
			}
			Node nd = new Node(val,temp.next);
			temp.next=nd;
			size++;
		}
	}
	public int deleteFirst(){
		if(head == null){
			tail = null;
		}
		int val = head.value;
		head = head.next;
		size--;
	}
	public int deleteLast(){
		if(size<=1){
			return deleteFirst();
		}
		Node secondLast = get(size-2);
		tail = secondLast;
		tail.next = null;
		return val; 
	}
	public Node get(int index){
		Node node = head;
		for(int i = 0;i<index;i++){
			node = node.next;
		}
		return node;
	}
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.prin(temp.value + "->");
			temp = temp.next;
		}
		System.out.print("End");
	}
}


public class rough{
	public static void main(String[] args) {
		int num = 11;
		System.out.println(11/3);
	        System.out.println(11%3);
	}
}
