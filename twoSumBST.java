package Arrays;

import java.util.HashSet;
import java.util.Set;

public class twoSumBST {

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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        boolean ans = check2sum(root,k,set);
        return ans ? true : false;
    }
    public static boolean check2sum(TreeNode root, int sum, Set<Integer> set){
        if (root == null){
            return false;
        } else if (check2sum(root.left,sum,set) == true) {
            return true;
        }
        else if (set.contains(sum - root.val)){
            return true;
        }
        set.add(root.val);
        return check2sum(root.right,sum,set);
    }
    public static void main(String[] args) {

    }
}
