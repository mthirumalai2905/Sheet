import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        int[] res = new int[2];

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                res[0] = left;
                res[1] = right;
                return res;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}
