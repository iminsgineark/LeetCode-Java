/**
 * @author Utkrist Ark
 * @date 24-08-2023
 * @version java 11.0.19
 */



package Arrays;
class QueueArray{
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    public QueueArray(int size){               //TC- O(1)               SC - O(1)
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue Is Created Of Size " + size);
    }
    public boolean isFull(){              // TC - O(1)
        if (topOfQueue == arr.length - 1){
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty(){             //TC - O(1)
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length){
            return true;
        }
        else {
            return false;
        }
    }
    public void Enqueue(int value){                        // TC - O(1)
        if (isFull()){
            System.out.println("Queue Is Full");
        }
        else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Value Added " + value + " To Queue");
        }
        else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Value Added " + value + " To Queue");
        }
    }
    public int deQueue(){
        if (isEmpty()){
            System.out.println("Queue Is Empty");
            return -1;
        }
        else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }
    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }
        else {
            System.out.println("Queue Is Empty");
            return -1;
        }
    }
    public void DeleteQueue(){
        arr = null;
        System.out.println("Queue Is Deleted ");
    }
}

public class QueueImplementationUsingArray {
    public static void main(String[] args) {
        QueueArray queueArray =  new QueueArray(5);
    }
}
