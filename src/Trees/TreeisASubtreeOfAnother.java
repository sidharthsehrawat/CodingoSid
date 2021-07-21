package Trees;



import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Stream;

public class TreeisASubtreeOfAnother {
    //  private static TreeNode low;
    private static int max = Integer.MIN_VALUE;
    private static int low = Integer.MAX_VALUE;
    private static int count;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode next;

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

    private static boolean checkSubTree(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        } else if (root == null || root1 == null) {
            return false;
        } else if (root != null && root1 != null && root.data == root1.data) {
            boolean t1 = checkSubTree(root.left, root1.left);
            boolean t2 = checkSubTree(root.right, root1.right);
            return t1 || t2;
        } else {
            boolean t1 = checkSubTree(root.left, root1);
            boolean t2 = checkSubTree(root.right, root1);
            return t1 || t2;
        }
    }

    private static void lowestancestor(TreeNode root, int node) {
        if (root == null) {
            return;
        }
        if (root.data == node) {
            return;
        }
        if (root != null && root.data > node) {
            lowestancestor(root.left, node);
            if (low > root.data) {
                low = root.data;
            }
            if (max < root.data) {
                max = root.data;
            }
            // System.out.println(root.data);
        } else if (root != null && root.data < node) {
            lowestancestor(root.right, node);
            if (low > root.data) {
                low = root.data;
            }
            if (max < root.data) {
                max = root.data;
            }
            // System.out.println(root.data);
        }
    }

    public static void lowectCOMMONAncestors(TreeNode root, int node1, int node2) {
        if (root == null) {
            return;
        } else if (root.data > node1 && root.data > node2) {
            lowectCOMMONAncestors(root.left, node1, node2);
        } else if (root.data < node1 && root.data < node2) {
            lowectCOMMONAncestors(root.right, node1, node2);
        } else {
            System.out.println("lowest common ancestor" + root.data);
        }
    }

    public static void spiralTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                TreeNode poppedElement = stack1.pop();
                System.out.print(" " + poppedElement.data);
                if (poppedElement.right != null) {
                    stack2.push(poppedElement.right);
                }
                if (poppedElement.left != null) {
                    stack2.push(poppedElement.left);
                }
            }
            while (!stack2.isEmpty()) {
                TreeNode popRoot = stack2.pop();
                System.out.print(" " + popRoot.data);

                if (popRoot.left != null) {
                    stack1.push(popRoot.left);
                }
                if (popRoot.right != null) {
                    stack1.push(popRoot.right);
                }
            }
        }
    }

    public static void joinColumnINLEvel(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode prev;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            prev = null;
            while (size > 0) {
                root = queue.remove();
                if (prev != null) {
                    prev.next = root;
                }
                prev = root;
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
                size--;
            }
        }

    }

    public static void joinColumnINLEvelWithoutQueue(TreeNode root) {
        if (root == null) {
            return;
        }
        // check for leaf
        if (root.left == null && root.right == null) {
            return;
        }

        if (root.left != null && root.right != null) {
            root.left.next = root.right;
        }
        if ((root.left != null || root.right == null) && root.next != null) {
            if (root.left != null) {
                root.left.next = findNext(root.next);
            }
        }
        joinColumnINLEvelWithoutQueue(root.right);
        joinColumnINLEvelWithoutQueue(root.left);
    }

    private static TreeNode findNext(TreeNode next) {
        if (next.next == null) {
            if (next.left != null) {
                return next.left;
            } else {
                return next.right;
            }
        }
        return findNext(next.next);
    }

    public static void spiralDequeSolution(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(null);
        deque.offerFirst(root);
        if (root == null) {
            return;
        }

        while (deque.size() > 1) {
            TreeNode node = deque.peekFirst();
            while (node != null) {
                node = deque.pollFirst();
                System.out.println(" " + node.data);
                if (node.right != null) {
                    deque.offerLast(node.right);
                }
                if (node.left != null) {
                    deque.offerLast(node.left);
                }
                node = deque.peekFirst();
            }
            TreeNode peekLast = deque.peekLast();

            while (peekLast != null) {
                TreeNode node1 = deque.pollLast();
                System.out.println(" " + node1.data);
                if (node1.left != null) {
                    deque.offerFirst(node1.left);
                }
                if (node1.right != null) {
                    deque.offerFirst(node1.right);
                }
                peekLast = deque.peekLast();
            }

        }
    }

    public static int countLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //means there is child nodes
        if (root.left == null && root.right == null) {
            count++;
        }
        countLeafNodes(root.left);
        countLeafNodes(root.right);

        return count;
    }

    public static void spiralDEQUECOUNT(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerFirst(root);
        int count = 1;
        boolean flip = true;
        int totalCount = 0;
        while (!deque.isEmpty()) {
            while (count > 0) {
                if (flip) {
                    TreeNode node = deque.pollFirst();
                    System.out.println(" " + node.data);
                    if (node.right != null) {
                        deque.offerLast(node.right);
                        totalCount++;
                    }
                    if (node.left != null) {
                        deque.offerLast(node.left);
                        totalCount++;
                    }
                } else {
                    TreeNode node = deque.pollLast();
                    System.out.println(" " + node.data);
                    if (node.left != null) {
                        deque.offerFirst(node.left);
                        totalCount++;
                    }
                    if (node.right != null) {
                        deque.offerFirst(node.right);
                        totalCount++;
                    }
                }
                count--;
            }
            flip = !flip;
            count = totalCount;
        }
    }

    public static boolean isHeightBalanced(TreeNode root) {
        int diff = 0;
        if (root == null) {
            return true;
        }

        int height = calHeight(root, diff);
        if (height > 1)
            return false;
        else return true;
    }

    private static int calHeight(TreeNode root, int diff) {
        if (root == null) {
            return 0;
        }
        if (diff < 1) {
            int lsize = calHeight(root.left, diff);
            int rSize = calHeight(root.right, diff);
            if (diff > 1) {
                return diff;
            }
            if (lsize > rSize) {
                diff = lsize - rSize;
                return 1 + lsize;
            } else {
                diff = rSize - lsize;
                return 1 + rSize;
            }
        } else {
            return diff;
        }
    }


    private static boolean isBalanced(TreeNode node) {
        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;
        /* If we reach here then tree is not height-balanced */
        return false;
    }

    /* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
    /*  The function Compute the "height" of a tree. Height is the
        number of nodes along the longest path from the root node
        down to the farthest leaf node.*/
    static int height(TreeNode node) {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }


    private static boolean isBalancedUsingOneRecursion(TreeNode root, Height height) {
        /* If tree is empty then return true */
        if (root == null) {
            height.height = 0;
            return true;
        }

        /* Get heights of left and right sub trees */
        Height lheight = new Height(), rheight = new Height();
        boolean l = isBalancedUsingOneRecursion(root.left, lheight);
        boolean r = isBalancedUsingOneRecursion(root.right, rheight);
        int lh = lheight.height, rh = rheight.height;

        /* Height of current node is max of heights of
           left and right subtrees plus 1*/
        height.height = (lh > rh ? lh : rh) + 1;

        /* If difference between heights of left and right
           subtrees is more than 2 then this node is not balanced
           so return 0 */
        if (Math.abs(lh - rh) >= 2)
            return false;

        /* If this node is balanced and left and right subtrees
           are balanced then return true */
        else
            return l && r;
    }


    public static void main(String[] args) {
        TreeNode root = insertNode(null, 20);
        TreeNode root1 = insertNode(root, 10);
        TreeNode root2 = insertNode(root1, 40);
        TreeNode root3 = insertNode(root2, 5);
        TreeNode root4 = insertNode(root3, 15);
        TreeNode root5 = insertNode(root4, 25);
        TreeNode root6 = insertNode(root5, 50);
       // TreeNode root7 = insertNode(root6, 23);
       // TreeNode root8 = insertNode(root7, 21);

        TreeNode root1_ = insertNode(null, 40);
        TreeNode root2_ = insertNode(root1_, 25);
        TreeNode root3_ = insertNode(root2_, 50);
        TreeNode root4_ = insertNode(root3_, 23);
        Height height = new Height();
      //  System.out.println( isBalancedUsingOneRecursion(root6, height));
        System.out.println(isHeightBalanced(root6));
        // System.out.println(isBalanced(root8));
        // System.out.println(countLeafNodes(root8));
        // joinColumnINLEvelWithoutQueue(root8);
        // joinColumnINLEvel(root8);
        // spiralDEQUECOUNT(root8);
        // spiralDequeSolution(root8);
        //  spiralTraversal(root8);
        //lowectCOMMONAncestors(root8, 5, 15);
        // lowestancestor(root8, 23);
        // System.out.println("lowest" + low);
        //System.out.println("max" + max);
        //boolean res = checkSubTree(root8, root4_);
        //System.out.println(res);
    }

    static class Height {
        int height = 0;
    }

}
