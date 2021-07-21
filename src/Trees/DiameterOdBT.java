package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterOdBT {
    private int diameter;

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
        }
        if (root.data > data) {
            if (root.left != null) {
                insert(root.left, data);
            } else {
                root.left = newNode;
            }
        } else {
            if (root.right != null) {
                insert(root.right, data);
            } else {
                root.right = newNode;
            }
        }
        return root;
    }


    private static int heightMethod(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightMethod(root.left);
        int rightHeight = heightMethod(root.right);

        Height.diameter = (Math.max(Height.diameter, leftHeight + rightHeight + 1));
  /*  if(leftHeight>rightHeight){
        return leftHeight+1;
    }else{
        return rightHeight+1;
    }*/
        return Math.max(leftHeight, rightHeight) + 1;


    }

    private static int isSumTreeUsingRecurr(TreeNode root) {
        int lSum = 0, rSum = 0;
        if (root.left == null && root.right == null) {
            return root.data;
        }
        if (root.left != null) {
            lSum = isSumTreeUsingRecurr(root.left) ;
        }
        if (root.right != null) {
            rSum = isSumTreeUsingRecurr(root.right) ;
        }
        if (lSum + rSum != root.data) {
            return -1;
        }
        return lSum + rSum + root.data;
    }


    private static class Height {
        static int diameter;
    }

    public static void main(String[] args) {
       /* TreeNode root = insert(null, 20);
        TreeNode root1 = insert(root, 10);
        TreeNode root2 = insert(root1, 40);
        TreeNode root3 = insert(root2, 5);
        TreeNode root4 = insert(root3, 15);
        TreeNode root5 = insert(root4, 25);
        TreeNode root6 = insert(root5, 50);
        TreeNode root7 = insert(root6, 23);
        TreeNode root8 = insert(root7, 22);
        TreeNode root9 = insert(root7, 22);
        System.out.println(heightMethod(root9));
        System.out.println("dimeter is ============" + Height.diameter);*/

        TreeNode root = new TreeNode(56);
        root.left = new TreeNode(13);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(2);
        System.out.println(isSumTreeUsingRecurr(root));


    }
}
