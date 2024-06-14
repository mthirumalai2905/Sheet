public class NumberOfRotations {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        System.out.println("The Number of Rotations in nums1 arrays is"+ findRotationCount(nums1));
    }

    public static int findRotationCount(int[] nums){
        int n = nums.length;
        int low = 0;
        int high  = n - 1;

        while(low <= high){
            if(nums[low] <= nums[high]){
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]){
                return mid;
            }

            if(nums[mid] <= nums[high]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
