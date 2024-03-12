///**
// * @author :- Utkrist Ark
// * @date :- 23/10/2023
// * @version :- java 11.0.19
// */
//
//package Arrays;
//
//class Stack<I extends Number> {
//    int[] arr;
//    int topOfStack;
//    public Stack(){
//        this.arr = new int[size]; // TC - O(N)
//        this.topOfStack = -1;
//        System.out.println("Size of Stack is " + size);
//    }
//    public boolean isEmpty(){
//        if (topOfStack == -1){
//            return true;   // TC - O(N)
//        }
//        else {
//            return false;
//        }
//    }
//
//    public boolean isFull(){
//        if (topOfStack == arr.length - 1){
//            System.out.println("Stack Is Full");
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    public void push(int val){
//        if (isFull()){
//            System.out.println("Stack Is Full");
//        }
//        else {                                             // TC - O(1)
//            arr[topOfStack + 1] = val;
//            topOfStack++;
//            System.out.println("Value Inserted");
//        }
//    }
//
//    public int pop(){
//        if (isEmpty()){
//            System.out.println("Stack Is Empty");
//            return -1;
//        }
//        else {
//            int topStack = arr[topOfStack];                // TC - O(1)
//            topOfStack--;
//            return topStack;
//        }
//    }
//
//    public int peek(){                                   // TC - O(1)
//        if (isEmpty()){
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        else {
//            return arr[topOfStack];
//        }
//    }
//    public void Delete(){
//        arr = null;
//        System.out.println("Stack Is Successfully Deleted");
//    }
//}
//public class StackImplementationUsingArray {
//    public static void main(String[] args) {
//        Stack<Number> newStack = new Stack<Number>();
////        boolean result = newStack.isEmpty();
////        System.out.println(result);
//        newStack.push(1);
//        newStack.push(2);
//        newStack.push(3);
//        newStack.push(4);
//        newStack.push(5);
//        System.out.println(newStack.pop());
//
//    }
//}
