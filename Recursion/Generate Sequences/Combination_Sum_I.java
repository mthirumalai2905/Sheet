import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, result, new ArrayList<>());
        return result;
    }

    private static void backtrack(int[] candidates, int target, int idx, List<List<Integer>> result, List<Integer> temp) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, result, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
