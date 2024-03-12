/**
 * @author Utkrist Ark
 * @since 09-08-2023
 */
package Arrays;
class customStacks{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public customStacks() {
        this(DEFAULT_SIZE);
    }

    public customStacks(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws stackException{
        if (isEmpty()){
            throw new stackException("Stack is empty");
        }
        return data[ptr--];
    }
    public int peek() throws stackException{
        if (isEmpty()){
            throw new stackException("Stack is empty");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
class dynamicStack extends customStacks{
    public dynamicStack(){
        super();
    }
    public dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
class stackException extends Exception{
    public stackException(String message){
        super(message);

    }
}
public class StacksImplementation {
    public static void main(String[] args) throws stackException {
        customStacks customStacks = new dynamicStack(5);
        customStacks.push(1);
        customStacks.push(2);
        customStacks.push(3);
        customStacks.push(4);
        customStacks.push(5);
        customStacks.push(6);
        System.out.println(customStacks.pop());
        System.out.println(customStacks.pop());
        System.out.println(customStacks.pop());
        System.out.println(customStacks.pop());
        System.out.println(customStacks.pop());
    }
}
