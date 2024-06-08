package Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // for(int i = 0; i < arr.length; i++){
        // for(int j = i; j < arr.length; j++){
        // System.out.print("[");
        // for(int k = i; k <= j; k++){
        // System.out.print(arr[k] + " ");
        // }
        // System.out.print("]");
        // System.out.println();
        // }
        // }

        // dp
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int maxSum = arr[0]; // Initialize maxSum with the first element of the array

        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(arr[i], arr[i] + dp[i - 1]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        System.out.print(maxSum);
        System.out.println();

        //Kadanes Algo
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for(int i = 1; i < arr.length; i++){
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.print(maxSoFar);

    }
}
