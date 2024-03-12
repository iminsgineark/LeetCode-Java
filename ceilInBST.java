package Arrays;

public class ceilInBST {
    static class node{
        int data;
        node left;
        node right;
        node(int val){
            this.data = val;
        }
    }

    public static int floor(node root, int x) {
        int ans = Integer.MIN_VALUE;
        if(root.data == x){
            return root.data;
        }
        else if (root.data > x){
            ans = root.data;
            root = root.left;
        }
        else {
            root = root.right;
        }
        return  ans;
    }
    public static void main(String[] args) {

    }
}
