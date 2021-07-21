package Trees;

public class CountNodesAtKthNumber {

    //private static TreeNode root;
    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private static TreeNode insert(TreeNode root, int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.data > root.data) {
            if (root.right != null) {
                insert(root.right, data);
            } else {
                root.right = newNode;
            }
        } else if (newNode.data < root.data) {
            if (root.left != null) {
                insert(root.left, data);
            } else {
                root.left = newNode;
            }
        }
        return root;
    }

    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(" " + root.data);
        inOrder(root.right);

    }

    private static void printNodesAtKthNumber(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        if (root != null && k == 0) {
            System.out.println(" " + root.data);
        } else {
            k--;
            printNodesAtKthNumber(root.left, k);
            printNodesAtKthNumber(root.right, k);
        }
    }

    private static boolean ancestors(TreeNode root, int node) {
        if (root == null) {
            return false;
        }
        if (root.data == node) {
            //System.out.println("ancestors are : " + root.data);
            return true;
        }
        boolean left = ancestors(root.left, node);
        boolean right = ancestors(root.right, node);
        if (left|| right ){
            System.out.println(" " + root.data);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = insert(null, 10);
        TreeNode root1 = insert(root, 8);
        TreeNode root2 = insert(root1, 16);
        TreeNode root3 = insert(root2, 6);
        TreeNode root4 = insert(root3, 9);
        TreeNode root5 = insert(root4, 14);
        TreeNode root6 = insert(root5, 18);

        //inOrder(root6);
        printNodesAtKthNumber(root6, 1);
        //ancestors(root6, 9);

    }
}
