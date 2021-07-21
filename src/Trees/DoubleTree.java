package Trees;


public class DoubleTree {
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
        }
        if (newNode.data < root.data) {
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

    private static TreeNode doubleTreeSize(TreeNode root) {
        TreeNode temp;
        if (root == null) {
            return root;
        }

        doubleTreeSize(root.left);
        doubleTreeSize(root.right);
        temp = root.left;
        root.left = new TreeNode(root.data);
        root.left.left = temp;
        return root;
    }

    private static TreeNode inOrder(TreeNode root) {
        if (root == null) {
            return root;
        }
        inOrder(root.left);
        System.out.println(" " + root.data);
        inOrder(root.right);
        return root;
    }

    private static boolean sameTree(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        } else if (root != null && root1 != null) {
            boolean t1=sameTree(root.left, root1.left);
            boolean t2=sameTree(root.right, root1.right);
            return (root.data == root1.data && t1 && t2);
        } else {
            return false;
        }
       /* if (root != null && root1 != null) {
            if (root.data == root1.data && (sameTree(root.left, root1.left) && sameTree(root.right, root1.right))) {
                return true;
            }
        }
        return false;*/
    }

    private static int countTrees(int keys) {
        int[] arr = new int[keys + 1];
        int i;
        arr[0] = arr[1] = 1;

        for (i = 2; i <= keys; i++) {
            arr[i] = 0;
            for (int j = 0; j < i; j++) {
                arr[i] += arr[j] * arr[i - j - 1];
            }

        }
        return arr[i - 1];
    }

    private static int countTreesRecursion(int keyNum) {
        if (keyNum <= 1) {
            return 1;
        }else {
            int left, right, sum = 0;
            for (int i = 1; i <= keyNum; i++) {
                left = countTreesRecursion(i - 1);
                right = countTreesRecursion(keyNum - i);
                sum += left * right;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        TreeNode root = insert(null, 2);
        TreeNode root1 = insert(root, 1);
        TreeNode root2 = insert(root1, 3);

        TreeNode root_ = insert(null, 2);
        TreeNode root_1 = insert(root_, 1);
        TreeNode root_2 = insert(root_1, 3);
        int countTrees = countTrees(4);
        int countTressrecursion=countTreesRecursion(4);
        System.out.println("number of trees" + countTrees+ "number of trees using recursion"+ countTressrecursion);

        boolean result = sameTree(root2, root_2);
        System.out.println(result);
        inOrder(root2);
        doubleTreeSize(root2);
        inOrder(root2);
    }

}
