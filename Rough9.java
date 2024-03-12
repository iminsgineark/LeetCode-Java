//package Arrays;
//
//import java.util.ArrayList;
//
//public class Rough9 {
//    class Node
//    {
//        int data;
//        Node left, right;
//
//        Node(int item)
//        {
//            data = item;
//            left = right = null;
//        }
//    }
//    class Tree
//    {
//        //Function to return list containing elements of left view of binary tree.
//        ArrayList<Integer> leftView(Node root)
//        {
//            // Your code here
//            ArrayList<Integer> list = new ArrayList<>();
//            leftView1(root,list,0);
//            return list;
//
//        }
//        public static void leftView1(Node root,ArrayList<Integer> ls,int level){
//            if(root == null){
//                return;
//            }
//            else if(level == ls.size()){
//                ls.add(root.data);
//            }
//            leftView1(root.left,ls,level+1);
//            leftView1(root.right,ls,level+1);
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
