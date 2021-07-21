package Trees;

public class IsBSTTree1 {
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
                newNode.right = newNode;
            }
        }
        return root;
    }


    private static boolean isBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.data > root.data) {
            return false;
        }
        if (root.right != null && root.right.data < root.data) {
            return false;
        }

        return (isBST(root.left) && isBST(root.right));
    }

    private static boolean isBST2(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data > max) {
            return false;
        }
        return isBST2(root.left, min, root.data) && isBST2(root.right, root.data, max);
    }


    public static void main(String[] args) {
        Integer min=Integer.MIN_VALUE;
        
        Integer max=Integer.MAX_VALUE;
        TreeNode root = insert(null, 2);
        TreeNode root2 = insert(root, 9);
        TreeNode root3 = insert(root2, 3);
        Boolean res = isBST(root3);
        Boolean res2=isBST2(root3,min,max);
        System.out.println("isBST " + res2);
    }
}
