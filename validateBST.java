package Arrays;

import com.sun.source.tree.Tree;

public class validateBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isBST(TreeNode root, long min, long max){
        if (root == null){
            return true;
        } else if (root.val < max || root.val > min) {
            return false;
        }
        return isBST(root.left,min,root.val) && isBST(root.left,root.val,max);
    }
    public static boolean isValidBST(TreeNode root) {
       return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static void main(String[] args) {

    }
}
