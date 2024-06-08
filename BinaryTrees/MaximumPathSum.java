// package BinaryTrees;

// import javax.swing.tree.TreeNode;

// public class MaximumPathSum {
//     private int maxSum = Integer.MIN_VALUE; 

//     public int maxPathSum(TreeNode root) {
//         calculateMaxSum(root); 
//         return maxSum;
//     }

//     private int calculateMaxSum(TreeNode node) {
//         if (node == null) return 0;

//         
//         int leftSum = Math.max(0, calculateMaxSum(node.left));
//         int rightSum = Math.max(0, calculateMaxSum(node.right));

//        
//         maxSum = Math.max(maxSum, node.data + leftSum + rightSum);

//         
//         return node.data + Math.max(leftSum, rightSum);
//     }
// }
