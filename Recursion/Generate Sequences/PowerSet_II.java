class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        backtrack(nums, n , 0, new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(int[] nums, int n, int idx, List<Integer> temp, List<List<Integer>> result){
        result.add(new ArrayList<>(temp));
        for(int i = idx; i < nums.length; i++){

            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backtrack(nums, n, i+1, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}
