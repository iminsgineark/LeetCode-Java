package Arrays;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class day3HW3 {

    // Priority Queue
    static class CustomPriorityQueue {
        private PriorityQueue<Integer> queue;

        public CustomPriorityQueue() {
            queue = new PriorityQueue<>();
        }

        public void add(int element) {
            queue.add(element);
        }

        public int remove() {
            return queue.poll();
        }

        public int peek() {
            return queue.peek();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    // Array-based Deque
    static class ArrayDeque {
        private int[] deque;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public ArrayDeque(int capacity) {
            this.capacity = capacity;
            deque = new int[capacity];
            front = -1;
            rear = 0;
            size = 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void insertFront(int key) {
            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = capacity - 1;
            } else {
                front = front - 1;
            }
            deque[front] = key;
            size++;
        }

        public void insertRear(int key) {
            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == capacity - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }
            deque[rear] = key;
            size++;
        }

        public void deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == capacity - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
            size--;
        }

        public void deleteRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = capacity - 1;
            } else {
                rear = rear - 1;
            }
            size--;
        }

        public int getFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return deque[front];
        }

        public int getRear() {
            if (isEmpty() || rear < 0) {
                System.out.println("Deque is empty");
                return -1;
            }
            return deque[rear];
        }
    }

    // Linked List-based Deque
    static class LinkedListDeque {
        Node front, rear;

        static class Node {
            int data;
            Node prev, next;

            Node(int data) {
                this.data = data;
                this.prev = this.next = null;
            }
        }

        public LinkedListDeque() {
            front = rear = null;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public void insertFront(int key) {
            Node newNode = new Node(key);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
        }

        public void insertRear(int key) {
            Node newNode = new Node(key);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
        }

        public void deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                front.prev = null;
            }
        }

        public void deleteRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            if (front == rear) {
                front = rear = null;
            } else {
                rear = rear.prev;
                rear.next = null;
            }
        }

        public int getFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return front.data;
        }

        public int getRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return rear.data;
        }
    }

    // Input-Restricted Deque
    static class InputRestrictedDeque {
        private int[] deque;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public InputRestrictedDeque(int capacity) {
            this.capacity = capacity;
            deque = new int[capacity];
            front = -1;
            rear = 0;
            size = 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void insertRear(int key) {
            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == capacity - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }
            deque[rear] = key;
            size++;
        }

        public void deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == capacity - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
            size--;
        }

        public void deleteRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = capacity - 1;
            } else {
                rear = rear - 1;
            }
            size--;
        }

        public int getFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return deque[front];
        }

        public int getRear() {
            if (isEmpty() || rear < 0) {
                System.out.println("Deque is empty");
                return -1;
            }
            return deque[rear];
        }
    }

    // Output-Restricted Deque
    static class OutputRestrictedDeque {
        private int[] deque;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public OutputRestrictedDeque(int capacity) {
            this.capacity = capacity;
            deque = new int[capacity];
            front = -1;
            rear = 0;
            size = 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void insertFront(int key) {
            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = capacity - 1;
            } else {
                front = front - 1;
            }
            deque[front] = key;
            size++;
        }

        public void insertRear(int key) {
            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == capacity - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }
            deque[rear] = key;
            size++;
        }

        public void deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == capacity - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
            size--;
        }

        public int getFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return deque[front];
        }

        public int getRear() {
            if (isEmpty() || rear < 0) {
                System.out.println("Deque is empty");
                return -1;
            }
            return deque[rear];
        }
    }

    // Balanced Parentheses using Stack implemented with Queue
    static class BalancedParentheses {
        Queue<Character> queue1;
        Queue<Character> queue2;

        public BalancedParentheses() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(char c) {
            queue1.add(c);
        }

        public char pop() {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            char topElement = queue1.poll();
            Queue<Character> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return topElement;
        }

        public boolean isBalanced(String expression) {
            for (char ch : expression.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    push(ch);
                } else {
                    if (queue1.isEmpty()) return false;
                    char top = pop();
                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return queue1.isEmpty();
        }
    }

    // Evaluate Reverse Polish Notation
    static class ReversePolishNotation {
        public int evaluate(String[] tokens) {
            Queue<Integer> queue = new LinkedList<>();

            for (String token : tokens) {
                if ("+-*/".contains(token)) {
                    int b = queue.poll();
                    int a = queue.poll();
                    switch (token) {
                        case "+":
                            queue.add(a + b);
                            break;
                        case "-":
                            queue.add(a - b);
                            break;
                        case "*":
                            queue.add(a * b);
                            break;
                        case "/":
                            queue.add(a / b);
                            break;
                    }
                } else {
                    queue.add(Integer.parseInt(token));
                }
            }
            return queue.poll();
        }
    }

    // Queue using Two Stacks
    static class QueueUsingStacks {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public QueueUsingStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enqueue(int x) {
            stack1.push(x);
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }

    // First Unique Character in a String using Deque
    static class FirstUniqueCharacter {
        public char firstUniqueChar(String s) {
            Deque<Character> deque = new LinkedList<>();
            Map<Character, Integer> countMap = new HashMap<>();

            for (char ch : s.toCharArray()) {
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
                if (countMap.get(ch) == 1) {
                    deque.addLast(ch);
                }
            }

            while (!deque.isEmpty() && countMap.get(deque.peekFirst()) > 1) {
                deque.removeFirst();
            }

            return deque.isEmpty() ? ' ' : deque.peekFirst();
        }
    }

    // Min Stack using Deque
    static class MinStack {
        Deque<Integer> stack;
        Deque<Integer> minStack;

        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        // Test your implementations here
    }
}


