import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public List<Integer> boundaryTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        // Add root node
        result.add(node.data);

        // Get the left boundary excluding the leaf nodes
        getLeftBoundary(node.left, result);

        // Get all the leaf nodes
        getLeaves(node.left, result);
        getLeaves(node.right, result);

        // Get the right boundary excluding the leaf nodes
        getRightBoundary(node.right, result);

        return result;
    }

    private static void getLeftBoundary(Node node, List<Integer> list) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }
        list.add(node.data);
        if (node.left != null) {
            getLeftBoundary(node.left, list);
        } else {
            getLeftBoundary(node.right, list);
        }
    }

    private static void getRightBoundary(Node node, List<Integer> list) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }
        if (node.right != null) {
            getRightBoundary(node.right, list);
        } else {
            getRightBoundary(node.left, list);
        }
        list.add(node.data); // Add after recursive call to get reverse order
    }

    private static void getLeaves(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            list.add(node.data);
            return;
        }
        getLeaves(node.left, list);
        getLeaves(node.right, list);
    }

    public static void main(String[] args) {
        BoundaryTraversal tree = new BoundaryTraversal();
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.right = new Node(25);

        List<Integer> boundary = tree.boundaryTraversal(root);
        System.out.println("Boundary Traversal of binary tree: " + boundary);
    }
}
