//package Arrays;
//
//public class MinAndMaxInBT {
//    class Node {
//        int data;
//        Node left;
//        Node right;
//        Node(int data) {
//            this.data = data;
//            left = null;
//            right = null;
//        }
//    }
//    static int minValue(Node node) {
//        Node current = node;
//        if (current == null){
//            return -1;
//        }
//        Node ns = node;
//        while (ns.left != null){
//            node = node.left;
//        }
//        return node.data;
//    }
//    static  int maxValue(Node node) {
//        Node current = node;
//        if (current == null){
//            return -1;
//        }
//        Node ns = node;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
