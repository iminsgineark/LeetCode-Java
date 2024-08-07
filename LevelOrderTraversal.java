package Arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {
    class TreeNode {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if (root == null){
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer> subList= new LinkedList<Integer>();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                else if (queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
