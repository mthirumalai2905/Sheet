package BinaryTrees;

public class DiameterOfBinaryTree {
    
    public static int diam = 0;

    public static int diameter(Node root) {
        if (root == null) return 0;

        
        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);

        
        diam = Math.max(diam, leftHeight + rightHeight);

        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
    }
}
