package Arrays;

public class deleteInBST {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node deleteNode(Node root, int X) {
        // code here.
        if (root == null){
            return root;
        }
        else if (root.data > X){
            root.left = deleteNode(root.left,X);
        } else if (root.data < X) {
            root.right = deleteNode(root.right,X);
        }
        else {
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    static int minValue(Node root){
        int minV = root.data;
        while (root.left != null){
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }
    public static void main(String[] args) {

    }
}
