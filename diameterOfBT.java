package Arrays;

public class diameterOfBT {
    static class node{
        int data;
        node left;
        node right;
        node(int val){
            this.data = val;
        }
    }

    public int diameter(node root){
        if (root == null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        int cur = height(root.left) + height(root.right) + 1;
        return Math.max(cur,Math.max(left,right));
    }
    public static int height(node root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void main(String[] args) {

    }
}
