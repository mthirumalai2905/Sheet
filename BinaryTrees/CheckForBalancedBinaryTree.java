package BinaryTrees;

public class CheckForBalancedBinaryTree {
    public static void main(String[] args) {
        
    }

    public static int depth(Node root){
        if(root == null) return 0;

        int lh = depth(root.left);
        if(lh == -1) return -1;
        int rh = depth(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh-rh) > 1) return -1;

        return Math.max(lh,rh) + 1;
    }


}
