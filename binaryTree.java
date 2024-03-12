package Arrays;


import java.util.Scanner;

class BinaryTrees {

    public BinaryTrees() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }

    class BST {
        public class Node {
            private int value;
            private Node left;
            private Node right;
            private int height;

            public Node(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }
        }

        private Node root;

        public BST() {

        }

        public void insert(int value) {
            root = insert(value, root);
        }

        private Node insert(int value, Node node) {
            if (node == null) {
                node = new Node(value);
                return node;
            }

            if (value < node.value) {
                node.left = insert(value, node.left);
            }

            if (value > node.value) {
                node.right = insert(value, node.right);
            }

            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return node;
        }

        public void populate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                this.insert(nums[i]);
            }
        }

        public void populatedSorted(int[] nums) {
            populatedSorted(nums, 0, nums.length);
        }

        private void populatedSorted(int[] nums, int start, int end) {
            if (start >= end) {
                return;
            }

            int mid = (start + end) / 2;

            this.insert(nums[mid]);
            populatedSorted(nums, start, mid);
            populatedSorted(nums, mid + 1, end);
        }

        public void display() {
            display(this.root, "Root Node: ");
        }

        private void display(Node node, String details) {
            if (node == null) {
                return;
            }
            System.out.println(details + node.value);
            display(node.left, "Left child of " + node.value + " : ");
            display(node.right, "Right child of " + node.value + " : ");
        }

        public boolean isEmpty() {
            return root == null;
        }

        public int height(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }

        public boolean balanced() {
            return balanced(root);
        }

        private boolean balanced(Node node) {
            if (node == null) {
                return true;
            }
            return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
        }

    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         BinaryTrees binaryTrees = new BinaryTrees();
         binaryTrees.populate(scanner);
         binaryTrees.display();
//
//        BST tree = new BST();
//        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//        tree.populate(nums);
//        tree.display();
    }
}