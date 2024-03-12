package Arrays;

import kotlin.Pair;

import java.util.*;

public class verticalOrderTraversalBST {

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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<pair> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.add(new pair(0,root));
        while (!q.isEmpty()){
            pair cur = q.poll();
            if (map.containsKey(cur.hd)){
                map.get(cur.hd).add(cur.node.val);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(cur.node.val);
                map.put(cur.hd,temp);
            }
            if (cur.node.left != null){
                q.add(new pair(cur.hd - 1,cur.node.left));
            } else if (cur.node.right != null) {
                q.add(new pair(cur.hd + 1,cur.node.right));
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            ans.addAll(entry.getValue());
        }
        return Collections.singletonList(ans);
    }
    static class pair {
        int hd;
        TreeNode node;
        public pair(int hd,TreeNode node){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void main(String[] args) {

    }
}
