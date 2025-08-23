package S12_Tree.P01_Easy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q01_Implementation {

    // Tree Traversals - DFS
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

    // Height of a Binary Tree
    public static int heightOfTree(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    // Print Nth Level
    public static void printNthLevel(Node root, int n){
        if (root == null) return;

        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        printNthLevel(root.left, n-1);
        printNthLevel(root.right, n-1);
    }

    // Tree traversal - BFS
    public static void leverOrder(Node root){
        int level = heightOfTree(root) + 1;
        for (int i=1; i<=level; i++) printNthLevel(root, i);
    }

    public static void levelOrderUsingQueue(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);

        while (!q.isEmpty()){
            Node temp = q.peek();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }

    // Size if Binary Tree - Total number of nodes in a binary tree
    public static int sizeOfBinaryTree(Node root) {
        if (root == null) return 0;
        return 1 + sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);
    }

    // Sum of all nodes in a Binary Tree
    public static int sumOfTreeNodes(Node  root) {
        if (root == null) return 0;
        return root.val + sumOfTreeNodes(root.left) + sumOfTreeNodes(root.right);
    }

    // Maximum node in a Binary Tree
    public static int maximumNode(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maximumNode(root.left), maximumNode(root.right)));
    }

    // Minimum node in a Binary Tree
    public static int minimumNode(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minimumNode(root.left), minimumNode(root.right)));
    }

    // Diameter of a Binary Tree - longest path between any two nodes in a tree (need not be paas through root node)
    public static int diameterOfBinaryTree(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int mid = heightOfTree(root.left) + heightOfTree(root.right);
        if (root.left != null) mid++;
        if (root.right != null) mid++;

        return Math.max(mid, Math.max(left, right));
    }

    // Balanced Binary Tree - difference between left and right side from each node is at-most 1
    public static boolean isBalancedBinaryTree(Node root) {
        if (root == null) return true;

        int lh = heightOfTree(root.left);
        if (root.left != null) lh++;

        int rh = heightOfTree(root.right);
        if (root.right != null) rh++;

        int difference = Math.abs(lh-rh);
        if (difference > 1) return false;

        return (isBalancedBinaryTree(root.left) && isBalancedBinaryTree(root.right));
    }

    // Same trees - values are same with same structure
    public static boolean areSameBinaryTrees(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return (areSameBinaryTrees(root1.left, root2.left) && areSameBinaryTrees(root1.right, root2.right));
    }

    // Binary Tree paths - from root to leaf nodes
    public static List<String> binaryTreePaths(Node root){
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }

    public static void helper(Node root, List<String> ans, String s){
        if (root == null) return;
        if (root.left == null && root.right == null) {
            s += root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s+root.val + "->");
        helper(root.right, ans, s+root.val + "->");
    }

    // Binary Tree paths - from any node to root node
//    public static List<String> binaryTreePaths2(Node root) {
//        List<String> ans = new ArrayList<>();
//    }


    // Lowest Common Ancestor (LCA)
    public static Node lowestCommonAncestor(Node root, Node p, Node q){
        if (p == root || q == root) return root;
        if (p == q) return p;

        boolean leftP = contains(root.left, p);
        boolean rightQ = contains(root.right, q);

        if (leftP && rightQ) return root;
        if (!leftP && !rightQ) return root;
        if (leftP && !rightQ) return lowestCommonAncestor(root.left, p, q);
        if (!leftP && rightQ) return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    public static boolean contains(Node root, Node node){
        if (root == null) return false;
        if (root == node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.left.right.left = new Node(8);
        // root.right.left.left = new Node(8);
        // root.right.left.left.left = new Node(18);

        // New Binary Trees
        // Tree-1
        Node newRoot = new Node(1);
        newRoot.left = new Node(2);
        newRoot.right = new Node(3);
        // Tree-2
        Node newRoot2 = new Node(1);
        newRoot2.left = new Node(2);
        newRoot2.right = new Node(3);


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
        System.out.println();

        System.out.println("Diameter of BinaryTree: " + diameterOfBinaryTree(root));

        System.out.println("Balanced BinaryTree: " + isBalancedBinaryTree(root));

        System.out.println("Are same Binary trees: " + areSameBinaryTrees(newRoot, newRoot2));

        System.out.println(binaryTreePaths(root));

        System.out.println("Lowest Common Ancestor: " + lowestCommonAncestor(root, root.left.left, root.left.right.left).val);
    }
}
