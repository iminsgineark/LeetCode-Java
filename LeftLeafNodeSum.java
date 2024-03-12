package Arrays;

public class LeftLeafNodeSum {
 class Node
 {
     int data;
     Node left, right;

     public Node(int d)
     {
         data = d;
         left = right = null;
     }
 }
    public int leftLeavesSum(Node root)
    {
        int sum = 0;
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null){
            sum = sum + root.data;
        }
        return leftLeavesSum(root.left) + leftLeavesSum(root.right) + sum;
    }
    public static void main(String[] args) {

    }
}
