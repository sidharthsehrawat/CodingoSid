package Trees;

public class TreesAllOrderTraversal {
    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    // creating BST
    private static TreeNode insertNode(TreeNode root, int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.data < root.data) {
            if (root.left != null) {
                insertNode(root.left, data);
            } else {
                root.left = newNode;
            }
        } else if (newNode.data > root.data) {
            if (root.right != null) {
                insertNode(root.right, data);
            } else {
                root.right = newNode;
            }
        }
        return root;
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOder(root.left);
        System.out.print(" " + root.data);
        inOder(root.right);
    }

    private static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.data);
    }

    public static void main(String[] args) {
        TreeNode root = TreesAllOrderTraversal.insertNode(null, 20);
        TreeNode root1 = TreesAllOrderTraversal.insertNode(root, 10);
        TreeNode root2 = TreesAllOrderTraversal.insertNode(root1, 40);
        TreeNode root3 = TreesAllOrderTraversal.insertNode(root2, 5);
        TreeNode root4 = TreesAllOrderTraversal.insertNode(root3, 15);
        TreeNode root5 = TreesAllOrderTraversal.insertNode(root4, 25);
        TreeNode root6 = TreesAllOrderTraversal.insertNode(root5, 50);
        preOrder(root6);
        postOrder(root6);
        inOder(root6);
    }
}
