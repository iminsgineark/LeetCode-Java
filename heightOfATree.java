package Arrays;

public class heightOfATree {
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    static int height(Node node){
        if (node == null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return 1 + Math.max(left,right);
    }

    public static void main(String[] args) {

    }
}
