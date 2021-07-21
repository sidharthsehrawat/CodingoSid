package Trees;

public class DeletionNodeBST {
    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private static TreeNode insert(TreeNode root, int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            return newNode;
        } else if (newNode.data < root.data) {
            if (root.left != null) {
                insert(root.left, data);
            } else {
                root.left = newNode;
            }
        } else if (newNode.data > root.data) {
            if (root.right != null) {
                insert(root.right, data);
            } else {
                root.right = newNode;
            }
        }
        return root;
    }

    private static TreeNode delete(TreeNode root, int deleteNode) {

        if (root == null) {
            return null;
        } else if (root.data > deleteNode) {
            root.left = delete(root.left, deleteNode);
        } else if (root.data < deleteNode) {
            root.right = delete(root.right, deleteNode);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
                return root;
            } else if (root.left != null && root.right == null) {
                //means one child is null
               // TreeNode temp1 = root;
                root = root.left;
                //temp1 = null;

            } else if (root.right != null && root.left == null) {
                //TreeNode temp2 = root;
                root = root.right;
                //temp2 = null;
            } else if (root.left != null && root.right != null) {
                int minNode = minValue(root.right);
                root.data = minNode;
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    private static int minValue(TreeNode root) {
        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(" " + root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = insert(null, 50);
        TreeNode root1 = insert(root, 30);
        TreeNode root2 = insert(root1, 70);
        TreeNode root3 = insert(root2, 20);
        TreeNode root4 = insert(root3, 40);
        TreeNode root5 = insert(root4, 60);
        TreeNode root6 = insert(root5, 80);
        inOrder(root6);
        TreeNode finalRoot = delete(root6, 20);
        inOrder(finalRoot);
        TreeNode finalRoot1 = delete(finalRoot, 30);
        inOrder(finalRoot1);
        TreeNode finalRoot2 = delete(finalRoot1, 50);
        inOrder(finalRoot2);
    }
}
