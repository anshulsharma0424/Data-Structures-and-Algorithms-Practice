package S12_Tree.P01_Easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Q01_Implementation {

    public static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static int heightOfTree(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    public static void printNthLevel(Node root, int n){
        if (root == null) return;

        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        printNthLevel(root.left, n-1);
        printNthLevel(root.right, n-1);
    }

    public static void leverOrder(Node root){
        int level = heightOfTree(root) + 1;
        for (int i=1; i<=level; i++) printNthLevel(root, i);
    }

    public static void levelOrderUsingQueue(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);

        while (q.size() > 0){
            Node temp = q.peek();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }

    public static int sizeOfBinaryTree(Node root) {
        if (root == null) return 0;
        return 1 + sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);
    }

    public static int sumOfTreeNodes(Node  root) {
        if (root == null) return 0;
        return root.val + sumOfTreeNodes(root.left) + sumOfTreeNodes(root.right);
    }

    public static int maximumNode(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maximumNode(root.left), maximumNode(root.right)));
    }

    public static int minimumNode(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minimumNode(root.left), minimumNode(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
//        root.right.left.left = new Node(8);
//        root.right.left.left.left = new Node(18);

        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        inOrder(root);
        System.out.println();

        System.out.print("InOrder: ");
        postOrder(root);
        System.out.println();

        System.out.println("Size: " + sizeOfBinaryTree(root));

        System.out.println("Sum of all nodes: " + sumOfTreeNodes(root));

        System.out.println("Maximum node: " + maximumNode(root));

        System.out.println("Minimum node: " + minimumNode(root));

        System.out.print("Nth Level (3rd right now):  ");
        printNthLevel(root, 3);
        System.out.println();

        System.out.println("Height: " + heightOfTree(root));

        System.out.print("LevelOrder N*(logN) - Recursive way: ");
        leverOrder(root);
        System.out.println();

        System.out.print("LevelOrder Optimized (using queue / Iterative way - O(N): ");
        levelOrderUsingQueue(root);

    }
}
