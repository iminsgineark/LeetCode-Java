
/**
 * @author Utkrist Ark
 * @date 17-08-2023
 * @version 17.0.7
 */

package Trees;

import java.util.Scanner;

class BinaryTree{
    private static class Node{
        int val;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int value){
            this.val = value;
        }
    }
    private Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter The Root Node Value");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("Do You want to enter left of " + node.val);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter The Value to the left of"+ node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner,node.left);
        }
        System.out.println("Do You want to enter right of " + node.val);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter The Value to the right of"+ node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }
    }
    public void display() {
    display(this.root, "");
}

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public void prettyDisplay(){

    }
    private void prettyDisplay(Node node,int level){
        if (node == null){
            return;
        }
        prettyDisplay(node.right,level + 1);
        if (level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+ node.val);
        }
        else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level + 1);
    }
}
public class Trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(sc);
        binaryTree.display();
    }
}
