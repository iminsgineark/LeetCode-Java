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

    public static int diameter(node root){
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
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);

        int treeHeight = height(root);
        int treeDiameter = diameter(root);
        System.out.println(treeHeight);
        System.out.println(treeDiameter);
    }
}
