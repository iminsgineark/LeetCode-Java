package Arrays;

import java.util.*;
import java.util.LinkedList;

public class zigZagTraversal {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigZag = new ArrayList<>();
        if (root == null){
            return zigZag;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reverseStack = new Stack<>();
            for (int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                if (flag){
                    reverseStack.add(node.data);
                }
                else {
                    level.add(node.data);
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                flag = !flag;
            }
            while (!reverseStack.isEmpty()){
                level.add(reverseStack.pop());
            }
            zigZag.add(level);
        }
        return zigZag;
    }
    public static void main(String[] args) {

    }
}
