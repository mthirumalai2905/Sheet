import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(current); // Directly add the current subset to the result list

        for (int i = index; i < nums.length; i++) {
            List<Integer> newSubset = new ArrayList<>(current);
            newSubset.add(nums[i]); // Create a new subset with the current element
            generateSubsets(i + 1, nums, newSubset, result); // Recurse with the next element
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
