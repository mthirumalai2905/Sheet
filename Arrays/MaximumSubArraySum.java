package Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 1, 4, 5, 1, 2, 3, 1, 3,0,0,0,0,0,4};
        int target = 4;
        int maxLen = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                } else if (sum > target) {
                    // If sum exceeds target, no need to continue with this subarray
                    break;
                }
            }
        }

        System.out.println(maxLen);
    }
}
