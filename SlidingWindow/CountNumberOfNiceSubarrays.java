class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         int count = 0;
        
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                int oddCount = 0;
                
                for (int i = start; i <= end; i++) {
                    if (nums[i] % 2 != 0) {
                        oddCount++;
                    }
                }
                
                if (oddCount == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
