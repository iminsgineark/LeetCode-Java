package Arrays;

import java.util.ArrayList;
import java.util.List;

public class viewsInBinaryTree {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root,list,0);
        return list;
    }
    public static void rightView(TreeNode root,List<Integer> result,int level){
        if (root == null){
            return;
        }
        else if (level == result.size()){
            result.add(root.val);
        }
        rightView(root.right,result,level+1);
        rightView(root.left,result,level+1);
    }
    public static void main(String[] args) {

    }
}
