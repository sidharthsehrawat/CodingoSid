package Trees;

import java.util.Stack;

public class IterativeInOrder {
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

    private static void Iterate(TreeNode root){
        if(root==null){
            System.out.println("Empty tree...");
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        while (!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else {
                temp=stack.pop();
                System.out.println(temp.data);
                temp=temp.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root=IterativeInOrder.insert(null,20);
        TreeNode root1=IterativeInOrder.insert(root,15);
        TreeNode root2=IterativeInOrder.insert(root1,10);
        TreeNode root3=IterativeInOrder.insert(root2,5);
        TreeNode root4=IterativeInOrder.insert(root3,40);
        TreeNode root5=IterativeInOrder.insert(root4,25);
        TreeNode root6=IterativeInOrder.insert(root5,50);
        IterativeInOrder.Iterate(root6);

    }

}
