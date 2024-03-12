package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Rough22 {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    static ArrayList<Integer> levelOrder(TreeNode root)
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            result.add(curr.data);
            if (curr.left != null){
                queue.add(curr.left);
            }
             if (curr.right != null){
                queue.add(curr.right);
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
