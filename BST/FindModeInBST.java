import java.util.ArrayList;

public class FindModeInBST {
    private int currNum;
    private int currFreq;
    private int maxFreq;
    private ArrayList<Integer> list;

    public int[] findMode(TreeNode root) {
        currNum = 0;
        currFreq = 0;
        maxFreq = 0;
        list = new ArrayList<>();

        dfs(root);

        // Convert the list to an array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);

        // Process current node
        if (root.val == currNum) {
            currFreq++;
        } else {
            currNum = root.val;
            currFreq = 1;
        }

        if (currFreq > maxFreq) {
            list.clear();
            list.add(currNum);
            maxFreq = currFreq;
        } else if (currFreq == maxFreq) {
            list.add(currNum);
        }

        dfs(root.right);
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
