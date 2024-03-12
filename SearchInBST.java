package Arrays;

public class SearchInBST {
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

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            TreeNode ans = new TreeNode();
            if (root == null){
                return null;
            }
            else if (root.val == val){
                return root;
            }
            else if (root.val > val){
                ans = searchBST(root.left,val);
            }
            else if (root.val < val){
                ans = searchBST(root.right,val);
            }
            return ans;
        }
    }
    public static void main(String[] args) {

    }
}
