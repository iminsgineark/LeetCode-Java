package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Rough32 {
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
        List<Integer> ans = new ArrayList<>();
        rightSide(root,ans,0);
        return ans;
    }
    public static void rightSide(TreeNode root,List<Integer> ls,int level){
        if (root == null){
            return;
        }
        else if (level == ls.size()){
            ls.add(root.val);
        }
        rightSide(root.left,ls,level+1);
        rightSide(root.right,ls,level+1);
    }
    public static void main(String[] args) {

    }
}
