## DSW Algorithm
**The DSW (Day-Stout-Warren) algorithm is a tree balancing technique used to transform a binary search tree (BST) into a perfectly balanced binary search tree. The algorithm works in two main phases: the vine (or backbone) creation phase and the balancing phase.**

* Phase 1: Vine Creation
The goal of this phase is to transform the BST into a right-linear tree (or vine), where each node has no left child. This is achieved by repeatedly performing right rotations.

Initialize: Start with a pseudo-root node whose right child is the root of the BST.
Traversal: Traverse the tree using the right pointers.
Left Child Handling: For each node, if it has a left child, perform a right rotation to move the left child up, making it the right child of its parent.
Repeat: Continue this process until the tree is transformed into a vine, where every node only has a right child.

* Phase 2: Balancing the Vine
The goal of this phase is to convert the vine into a balanced binary search tree. This is done by repeatedly performing left rotations to reduce the height of the tree.

Calculate the Number of Nodes: Determine the total number of nodes in the vine.
Initial Rotation Count: Calculate the number of nodes to be placed at the bottom-most level of the tree to ensure the tree is as balanced as possible.
Initial Rotations: Perform the necessary number of left rotations to create the bottom-most level.
Subsequent Rotations: After the initial rotations, continue to perform left rotations on each level of the tree, reducing the height by half each time.
Repeat: Continue until the tree is balanced

```java
public class DSW {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static TreeNode balanceBST(TreeNode root) {
        if (root == null) return null;

        TreeNode pseudoRoot = new TreeNode(0);
        pseudoRoot.right = root;

        int size = createVine(pseudoRoot);
        balanceVine(pseudoRoot, size);

        return pseudoRoot.right;
    }

    private static int createVine(TreeNode root) {
        TreeNode tail = root;
        TreeNode remainder = tail.right;
        int size = 0;

        while (remainder != null) {
            if (remainder.left == null) {
                tail = remainder;
                remainder = remainder.right;
                size++;
            } else {
                TreeNode temp = remainder.left;
                remainder.left = temp.right;
                temp.right = remainder;
                remainder = temp;
                tail.right = temp;
            }
        }

        return size;
    }

    private static void balanceVine(TreeNode root, int size) {
        int m = greatestPowerOf2LessThan(size + 1) - 1;
        compress(root, size - m);

        while (m > 1) {
            m /= 2;
            compress(root, m);
        }
    }

    private static int greatestPowerOf2LessThan(int n) {
        int x = Integer.highestOneBit(n);
        return (x == n) ? x : x / 2;
    }

    private static void compress(TreeNode root, int count) {
        TreeNode scanner = root;

        for (int i = 0; i < count; i++) {
            TreeNode child = scanner.right;
            scanner.right = child.right;
            scanner = scanner.right;
            child.right = scanner.left;
            scanner.left = child;
        }
    }

    // Utility function to print in-order traversal of the tree
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(30);

        System.out.println("Original BST (in-order):");
        inorderTraversal(root);
        System.out.println();

        root = balanceBST(root);

        System.out.println("Balanced BST (in-order):");
        inorderTraversal(root);
    }
}
```
