package BinaryTrees;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        
    }

    public static int depth(Node root){
        if(root == null) return 0;

        int lh = depth(root.left);
        int rh = depth(root.right);

        return 1 + Math.max(lh,rh);
    }
}
