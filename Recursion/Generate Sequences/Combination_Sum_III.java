import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int k, int n, int start, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == k && n == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (temp.size() >= k || n <= 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            temp.add(i);
            backtrack(k, n - i, i + 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
