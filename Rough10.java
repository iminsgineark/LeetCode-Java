//package Arrays;
//
//public class Rough10 {
//    public class TreeNode1 {
//        int val;
//        SearchInBST.TreeNode left;
//        SearchInBST.TreeNode right;
//        TreeNode1() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val,TreeNode left,TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    class Solution {
//        public TreeNode searchBST(TreeNode root, int val) {
//            TreeNode tr = new TreeNode();
//            if (root == null){
//                return null;
//            }
//            else if (root.val == val){
//                return root;
//            }
//            else if (root.val > val){
//                tr = searchBST(root.left,val);
//            }
//            else if (root.val < val){
//                tr = searchBST(root.right,val);
//            }
//            return tr;
//        }
//    }
//}
