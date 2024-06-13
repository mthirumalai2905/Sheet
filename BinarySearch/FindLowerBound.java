class FindLowerBound {
  public static int lowerBound(int[] arr, int target) {
    int n = arr.length;
    int ans = n;
    int low = 0, high = n - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] >= target) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] nums = {1, 3, 3, 5, 7, 8, 10};
    int target = 3;
    int result = lowerBound(nums, target);
    System.out.println(result); // Output should be 1

   
  }
}
