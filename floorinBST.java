package Arrays;

public class floorinBST {
    static class node{
        int data;
        node left;
        node right;
        node(int val){
            this.data = val;
        }
    }

    public static int floor(node root, int x) {
        // Code here
        int ans = Integer.MAX_VALUE;
        while (root != null){
            if (root.data == x){
                return root.data;
            }
            else if (root.data > x){
                root = root.left;
            }
            else {
                ans = root.data;
                root = root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
