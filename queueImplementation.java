//
///**
// * @author Utkrist Ark
// * @since 10-08-2023
// */
//// Includes the implementation of Simple Queue,Circular Queue & Dynamic Queue
//package Arrays;
//
//class Queue<N> {
//    private int[] data;
//
//    private static final int DEFAULT_SIZE = 10;
//
//    int end = 0;
//
//    public Queue(){
//        this(DEFAULT_SIZE);
//    }
//
//    public Queue(int size) {
//        this.data = new int[size];
//    }
//
//    public boolean isFull() {
//        return end == data.length; // ptr is at last index
//    }
//
//    public boolean isEmpty() {
//        return end == 0;
//    }
//
//    public boolean insert(int item) {
//        if (isFull()) {
//            return false;
//        }
//        data[end++] = item;
//        return true;
//    }
//
//    public int remove() throws Exception {
//        if (isEmpty()) {
//            throw new Exception("Queue is empty");
//        }
//
//        int removed = data[0];
//
//        // shift the elements to left
//        for (int i = 1; i < end; i++) {
//            data[i-1] = data[i];
//        }
//        end--;
//        return removed;
//    }
//
//    public int front() throws Exception{
//        if (isEmpty()) {
//            throw new Exception("Queue is empty");
//        }
//        return data[0];
//    }
//
//    public void display() {
//        for (int i = 0; i < end; i++) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println("END");
//    }
//}
//class circularQueue{
//    protected int[] data;
//    private static final int defaultSize = 10;
//    int end = 0;
//    int front = 0;
//    private int size = 0;
//    public circularQueue(){
//        this(defaultSize);
//    }
//    public circularQueue(int size){
//        this.data = new int[size];
//    }
//    public boolean isFull(){
//        return size == data.length;
//    }
//    public boolean isEmpty(){
//        return size == 0;
//    }
//    public boolean insert(int val){
//        if (isFull()){
//            return false;
//        }
//        data[end++] = val;
//        end = end % data.length;
//        size++;
//        return true;
//    }
//    public int remove() throws Exception{
//        if (isFull()){
//            throw new Exception();
//        }
//        int removed = data[front];
//        front = front % data.length;
//        size--;
//        return removed;
//    }
//    public int front() throws Exception{
//        if (isEmpty()){
//            throw new Exception();
//        }
//        return data[0];
//    }
//    public void display(){
//        if (isEmpty()){
//            System.out.println("Queue Is Empty");
//            return;
//        }
//        int i = front;
//        do {
//            System.out.print(data[i] + " ");
//            i++;
//            i %= data.length;
//        }while (i != end);
//        System.out.println("End");
//    }
//}
//class dynamicQueue extends circularQueue{
//    public dynamicQueue(){
//        super();
//    }
//    public dynamicQueue(int size){
//        super(size);
//    }
//
//    @Override
//    public boolean insert(int val) {
//        if (this.isFull()){
//            int[] temp = new int[data.length * 2];
//            for (int i = 0; i < data.length; i++) {
//                temp[i] = data[(front + i) % data.length];
//            }
//            front = 0;
//            end = data.length;
//            data = temp;
//        }
//        return super.insert(val);
//    }
//}
//public class queueImplementation {
//    public static void main(String[] args) throws Exception {
//        Queue<N> queue = new Queue<N>(5);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//        queue.display();
//        queue.remove();
//        queue.display();
//    }
//}
