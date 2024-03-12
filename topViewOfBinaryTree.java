package Arrays;

import java.util.*;
import java.util.Queue;

public class topViewOfBinaryTree {
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

    static class pair{
        int hd;
        Node node;
        public pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }

    }

    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<pair> queue = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.add(new pair(0,root));
        while (!queue.isEmpty()){
            pair cur = queue.poll();
            if (!map.containsKey(cur.hd)){
                map.put(cur.hd, cur.node.data);
            }
            else if (cur.node.left != null) {
                queue.add(new pair(cur.hd + 1,cur.node.left));
            }
            else if (cur.node.right != null){
                queue.add(new pair(cur.hd - 1,cur.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
