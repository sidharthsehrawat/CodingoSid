package Trees;

import java.util.Stack;
import java.util.WeakHashMap;

public class IterativePreOrderTree {

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private static StackNode top;

    private static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }

        StackNode() {

        }
    }

    private static StackNode push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
            return top;
        } else {
            newNode.next = top;
            top = newNode;
        }
        return top;
    }

    private static StackNode pop() {
        if (top == null) {
            System.out.println("Stack is empty...");
            return null;
        } else {
            StackNode temp = top;
            top = temp.next;
            temp.next = null;
        }
        return top;
    }

    private static boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

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

    private static void iterativePreOrder(TreeNode root) {
        if (root == null) {
            System.out.println("Empty Tree");
            return;
        } else {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                System.out.println(temp.data);
                if (temp.right != null) {
                    stack.push(temp.right);
                }

                if (temp.left != null) {
                    stack.push(temp.left);
                }
            }


        }
    }

    public static void main(String[] args) {
        TreeNode root=IterativePreOrderTree.insertNode(null,20);
        TreeNode root1=IterativePreOrderTree.insertNode(root,10);
        TreeNode root2=IterativePreOrderTree.insertNode(root1,40);
        TreeNode root3=IterativePreOrderTree.insertNode(root2,5);
        TreeNode root4=IterativePreOrderTree.insertNode(root3,15);
        TreeNode root5=IterativePreOrderTree.insertNode(root4,25);
        TreeNode root6=IterativePreOrderTree.insertNode(root5,50);
        IterativePreOrderTree.iterativePreOrder(root6);
    }

}
