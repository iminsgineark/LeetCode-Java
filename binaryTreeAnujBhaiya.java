//package Arrays;
//
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class binaryTreeAnujBhaiya {
//    static Scanner sc = null;
//    public static void main(String[] args) {
//        sc = new Scanner(System.in);
//       node root = createTree();
//        inOrder(root);
//    }
//    static node createTree(){
//        node root = null;
//        System.out.println("Enter The Data");
//        int data = sc.nextInt();
//        if (data == -1){
//            return null;
//        }
//        root = new node(data);
//        System.out.println("Enter Left Of Data " + data);
//        root.left = createTree();
//        System.out.println("Enter Right Of Data " + data);
//        root.right = createTree();
//        return root;
//    }
//    static void inOrder(node root){
//        if (root == null){
//            return;
//        }
//
//        inOrder(root.left);
//        System.out.println(root.data);
//        inOrder(root.right);
//    }
//
//    static void postOrder(node root){
//        if (root == null) {
//            return;
//        }
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.println(root.data);
//    }
//
//    static void preOrder(node root){
//        if (root == null){
//            return;
//        }
//        System.out.println(root.data);
//        preOrder(root.left);
//        preOrder(root.right);
//
//    }
//
//    static int height(node root){
//        if (root == null){
//            return 0;
//        }
//        return Math.max(height(root.left),height(root.right)) + 1;
//    }
//
//    static int size(node root){
//        if (root == null){
//            return 0;
//        }
//        return size(root.left) + size(root.right) + 1;
//    }
//
//    static int maxInATree(node root){
//        if (root == null){
//            return Integer.MIN_VALUE;
//        }
//        return Math.max(root.data,Math.max(maxInATree(root.left),maxInATree(root.right)));
//    }
//
//    static void currentLevel(node root, int level){
//        if (root == null){
//            return;
//        }
//        else if (level == 1){
//            System.out.println(root.data);                               //TC - O(n^2)
//        }
//        else if (level > 1){
//            currentLevel(root.left,level-1);
//            currentLevel(root.right,level-1);
//        }
//    }
//    static class node{
//        int data;
//        node left;
//        node right;
//        node(int val){
//            this.data = val;
//        }
//    }
//
//    public static void leftView(node root){
//        ArrayList<Node> list = new ArrayList<>();
//        printLeftViewUtil(root,list,0);
//        for (Node curr: list
//             ) {
//            System.out.println(curr.value + " ");
//        }
//    }
//    static void printLeftViewUtil(node root, ArrayList list, int level){
//        if (root == null){
//            return;
//        }
//        else if (list.get(level) == null){
//            list.set(level,root);
//        }
//        printLeftViewUtil(root.left, list ,level + 1);
//        printLeftViewUtil(root.right,list,level + 1);
//    }
//
//    public static void rightView(node root){
//     ArrayList<node> list = new ArrayList<>();
//     printRightViewUtil(root,list,0);
//        for (node curr: list
//             ) {
//            System.out.println(curr.data + " ");
//        }
//    }
//    public static void printRightViewUtil(node root, ArrayList list, int level){
//        if (root == null) {
//            return;
//        } else if (list.get(level) == null) {
//            list.set(level,root);
//        }
//        printRightViewUtil(root.right,list,level+1);
//        printRightViewUtil(root.left,list,level+1);
//    }
//}
