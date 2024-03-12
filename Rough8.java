package Arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Rough8 {
    class TreeNode {
        int val;
        LevelOrderTraversal.TreeNode left;
        LevelOrderTraversal.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, LevelOrderTraversal.TreeNode left, LevelOrderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if (root == null){
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek());
                }
            }
        }
        return wrapList;
    }
    public static void main(String[] args) {

    }
}
