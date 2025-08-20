package S12_Tree.P01_Easy;

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

        // int a = root.val;
        // int b = maximumNode(root.left);
        // int c = maximumNode(root.right);

        // return Math.max(a, Math.max(b,c));

        return Math.max(root.val, Math.max(maximumNode(root.left), maximumNode(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();

        System.out.println(sizeOfBinaryTree(root));

        System.out.println(sumOfTreeNodes(root));

        System.out.println(maximumNode(root));

    }
}
