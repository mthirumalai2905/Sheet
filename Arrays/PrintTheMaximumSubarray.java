/* Follow up Question from the Kadane's Algorithm */

class Solution {
    public int[] findMaxSubArray(int[] arr) {
        int sum = 0;
        int maxSum = arr[0];
        int start = -1;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return new int[] {maxSum, ansStart, ansEnd};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = solution.findMaxSubArray(arr);
        System.out.println("Max Sum: " + result[0] + ", Start Index: " + result[1] + ", End Index: " + result[2]);
    }
}
