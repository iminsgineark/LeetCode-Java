///**
// * @author :- Utkrist Ark
// * @date :- 23/10/2023
// * @version :- java 11.0.19
// */
//
//package Arrays;
//
//class Node{
//    public int value;
//    public Node next;
//
//}
//class LinkedList<E> {
//    public Node head;
//    public Node tail;
//    public int size;
//
//    public Node createSinglyLinkedList(int nodeValue) {
//        head = new Node();
//        Node node = new Node();
//        node.next = null;
//        node.value = nodeValue;
//        head = node;
//        tail = node;
//        size = 1;
//        return head;
//    }
//    public void insertInLinkedList(int nodeValue, int location) {
//        Node node = new Node();
//        node.value = nodeValue;
//        if (head == null) {
//            createSinglyLinkedList(nodeValue);
//            return;
//        } else if (location == 0) {
//            node.next = head;
//            head = node;
//        } else if (location >= size) {
//            node.next = null;
//            tail.next = node;
//            tail = node;
//        } else {
//            Node tempNode = head;
//            int index = 0;
//            while (index < location - 1) {
//                tempNode = tempNode.next;
//                index++;
//            }
//            Node nextNode = tempNode.next;
//            tempNode.next = node;
//            node.next = nextNode;
//        }
//        size++;
//    }
//
//    public void traverseSinglyLinkedList() {
//        if (head == null) {
//            System.out.println("SLL does not exist!");
//        } else {
//            Node tempNode = head;
//            for (int i = 0; i<size; i++) {
//                System.out.print(tempNode.value);
//                if (i != size - 1) {
//                    System.out.print(" -> ");
//                }
//                tempNode = tempNode.next;
//            }
//        }
//        System.out.println("\n");
//    }
//
//    // Search for a node
//
//    boolean searchNode(int nodeValue) {
//        if (head != null) {
//            Node tempNode = head;
//            for (int i=0; i<size; i++) {
//                if (tempNode.value == nodeValue) {
//                    System.out.print("Found the node at location: " +i+"\n");
//                    return true;
//                }
//                tempNode = tempNode.next;
//            }
//        }
//        System.out.print("Node not found! ");
//        return false;
//    }
//
//
//    public void deletionOfNode(int location) {
//        if (head == null) {
//            System.out.println("The SLL does not exist");
//            return;
//        } else if (location == 0) {
//            head = head.next;
//            size--;
//            if (size == 0) {
//                tail = null;
//            }
//        } else if (location >= size) {
//            Node tempNode = head;
//            for (int i = 0; i < size - 1; i++) {
//                tempNode = tempNode.next;
//            }
//            if (tempNode == head) {
//                tail = head = null;
//                size--;
//                return;
//            }
//            tempNode.next = null;
//            tail = tempNode;
//            size--;
//        } else {
//            Node tempNode = head;
//            for (int i = 0; i <location-1; i++) {
//                tempNode = tempNode.next;
//            }
//            tempNode.next = tempNode.next.next;
//            size--;
//        }
//    }
//    public void deleteSLL() {
//        head = null;
//        tail = null;
//        System.out.println("The SLL deleted successfully");
//
//    }
//}
//class Stack1{
//    LinkedList<E> linkedList;
//    public Stack1(){
//        linkedList = new LinkedList<E>();
//    }
//
//    public void push(int value){ // TC - O(1)
//        linkedList.insertInLinkedList(value,0);
//        System.out.println("Inserted " + value + " In Stack");
//    }
//
//    public boolean isEmpty(){                        // TC - O(1)
//        if (linkedList.head == null){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//    public int pop(){
//        int result = -1;
//        if (isEmpty()){
//            System.out.println("Stack Is Empty");
//            return -1;
//        }
//        else {
//            result = linkedList.head.value;
//            linkedList.deletionOfNode(0);
//        }
//        return result;
//    }
//
//    public int peek(){                         // TC - O(1)
//        if (isEmpty()){
//            System.out.println("Stack Is Empty");
//            return -1;
//        }
//        else {
//            return linkedList.head.value;
//        }
//    }
//
//
//    public void deleteStack(){
//        linkedList.head = null;
//        System.out.println("The Stack Is Deleted");
//    }
//}
//
//public class StackImplementationUsingLinkedList {
//    public static void main(String[] args) {
//        Stack1 newStack1 = new Stack1();
//        newStack1.push(1);
//        newStack1.push(2);
//        newStack1.push(3);
////        System.out.println(newStack1.isEmpty());
//    }
//}
