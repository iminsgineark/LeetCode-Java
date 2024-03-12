package Arrays;
import java.util.Stack;
class MyQueue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void push(int data){
        s1.push(data);
    }
    int pop(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
}
public class implementStackUsingQueue {

    public static void main(String[] args) {

    }
}
