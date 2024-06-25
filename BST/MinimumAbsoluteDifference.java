class MinimumAbsoluteDifference {
    private int min;
    private TreeNode prev;

    public void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);

        if (prev != null) {
            min = Math.min(min, Math.abs(root.val - prev.val));
        }

        prev = root;
        inOrder(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        prev = null;
        inOrder(root);
        return min;
    }
}
