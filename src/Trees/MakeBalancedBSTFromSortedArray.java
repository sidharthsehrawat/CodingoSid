package Trees;

public class MakeBalancedBSTFromSortedArray {
    private static class TreeNode {
         int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private static TreeNode insert(TreeNode root, int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return root;
        } else if (root.data > newNode.data) {
            if (root.left != null) {
                insert(root.left, data);
            } else {
                root.left = newNode;
            }
        } else if (root.data < newNode.data) {
            if (root.right != null) {
                insert(root.right, data);
            } else {
                root.right = newNode;
            }

        }
        return root;
    }

    public static TreeNode makeBalancdBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode newNode = new TreeNode(arr[mid]);
        newNode.left = makeBalancdBST(arr, start, mid - 1);
        newNode.right = makeBalancdBST(arr, mid + 1, end);
        return newNode;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(" " +root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        TreeNode root = insert(null, 20);
        TreeNode root1 = insert(root, 10);
        TreeNode root2 = insert(root1, 40);
        TreeNode root3 = insert(root2, 5);
        TreeNode root4 = insert(root3, 15);
        TreeNode root5 = insert(root4, 25);
        TreeNode root6 = insert(root5, 50);
        TreeNode root7 = insert(root6, 23);
        TreeNode root8 = insert(root7, 21);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
       TreeNode rootHead= makeBalancdBST(arr, 0, arr.length-1);
        preOrder(rootHead);
    }
}
