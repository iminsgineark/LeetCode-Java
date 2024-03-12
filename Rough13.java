package Arrays;

public class Rough13 {
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
    public void flatten(TreeNode root) {
//        TreeNode prev = null;
//        TreeNode head = null;
//        if (root == null){
//            return;
//        }
//        flatten(root.left);
//        if (prev == null){
//            head = root;
//        }
//        else {
//            root.left = prev;
//            prev.right = root;
//        }
//        prev = root;
//        flatten(root.right);
        while (root != null){
            if (root.left != null){
                TreeNode left = root.left;
                TreeNode current = left;
                while (current.right != null){
                    current = current.right;
                }
                current.right = root.right;
                root.left = null;
                root.right = left;
            }
            root = root.right;
        }
    }
    public static void main(String[] args) {

    }
}
