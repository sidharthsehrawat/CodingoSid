package Trees;

import java.util.*;

public class SizeOfTree {
    private static int count = 0;

    private static class TreeNode {
        int data;
        int hd;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        TreeNode(int data, int hd) {
            this.data = data;
            this.hd = hd;

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

    private static int size(TreeNode root) {

        if (root == null) {
            return 0;
        }
        // int lSize=size(root.left);
        // int rSize=size(root.right);
        return size(root.left) + size(root.right) + 1;
    }

    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l_size = height(root.left);
        int r_size = height(root.right);

        if (l_size > r_size) {
            return 1 + l_size;
        } else {
            return 1 + r_size;
        }

    }

    private static TreeNode minValue(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<Integer> queue=new LinkedList<>();

        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private static boolean hasPathSum(TreeNode root, int sum, int target) {

        if (root == null) {
            return false;
        }
        target = target - root.data;
        if (target == 0 && root.left == null && root.right == null) {
            return true;
        }
        boolean res = hasPathSum(root.left, sum, target);
        boolean res1 = hasPathSum(root.right, sum, target);
        return res || res1;
    }

    private static void printPaths(TreeNode root, Stack<Integer> stack) {
        if (root == null) {
            return;
        }
        stack.push(root.data);
        printPaths(root.left, stack);
        if (root.left == null && root.right == null) {
            stack.forEach(data -> {
                System.out.print(" " + data);
            });
        }
        printPaths(root.right, stack);
        stack.pop();
    }




    private static TreeNode levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp != null) {
                System.out.print(" " + temp.data);
                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            if (temp == null) {
                System.out.print("\n");
                queue.offer(null);
            }
        }
        return root;
    }

    private static TreeMap<Integer,List<Integer>> verticalOrder(TreeNode root, int hd) {
        if (root == null) {
            return null;
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> newList;
        root.hd = 0;
        //list.add(root.data);
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if(map.containsKey(temp.hd)){
                List<Integer> list12 =map.get(temp.hd);
                list12.add(temp.data);
                map.put(temp.hd, list12);
            }else {
                newList=new ArrayList<>();
                newList.add(temp.data);
                map.put(temp.hd,newList);
            }
            if (temp.left != null) {
                temp.left.hd = temp.hd - 1;
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                temp.right.hd = temp.hd + 1;
                queue.offer(temp.right);
            }
        }
        return map;
    }



    private static void mirrorTree(TreeNode root) {
        if (root != null) {
            mirrorTree(root.left);
            mirrorTree(root.right);
            swap(root);
        }
    }

    private static void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    private static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(" " + root.data);

    }


    public static void main(String[] args) {
        TreeNode root = insert(null, 10);
        TreeNode root1 = insert(root, 8);
        TreeNode root2 = insert(root1, 11);
        TreeNode root3 = insert(root2, 3);
        TreeNode root4 = insert(root3, 5);
        TreeNode root5 = insert(root4, 2);
        TreeNode root6 = insert(root5, 13);


        TreeNode r1=new TreeNode(50);

        TreeNode r2=new TreeNode(30);
        TreeNode r3=new TreeNode(70);
        TreeNode r4=new TreeNode(20);
        TreeNode r5=new TreeNode(40);
        TreeNode r6=new TreeNode(60);
        TreeNode r7=new TreeNode(80);
        TreeNode r8=new TreeNode(90);
        TreeNode r9=new TreeNode(98);

        r1.left=r2;
        r1.right=r3;
        r2.left=r4;
        r2.right=r5;
        r5.right=r8;
        r3.left=r6;
        r3.right=r7;
        r7.left=r9;

        System.out.println( verticalOrder(r1,0));

        // int countSize = size(root5);
        // System.out.println("Size of Tree " + countSize);

        // int height= height(root6);
        //System.out.println("Height of Tree : " + height);

        // TreeNode node = minValue(root6);
        //System.out.println("Minimun value" + node.data);
        // System.out.println(hasPathSum(root6, 0, 26));

        //Stack<Integer> stack = new Stack<>();
        //printPaths(root6, stack);
        // postOrder(root6);
        //mirrorTree(root6);
        //postOrder(root6);
        levelOrder(root6);

    }
}
