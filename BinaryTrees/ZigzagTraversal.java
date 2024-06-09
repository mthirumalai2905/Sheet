package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class ZigzagTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Zigzag traversal:");
        zigzagTraversal(root);
    }

    public static void zigzagTraversal(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (leftToRight) {
                    System.out.print(node.val + " ");
                } else {
                    stack.push(node);
                }

                // Enqueue the children (left first, then right)
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            // Print nodes from the stack (if right to left traversal)
            while (!stack.isEmpty()) {
                System.out.print(stack.pop().val + " ");
            }
            leftToRight = !leftToRight;
            System.out.println();
        }
    }
}
