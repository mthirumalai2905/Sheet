import java.util.ArrayList;
import java.util.List;

public class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        solve(arr, n, 0, 0, result);
        return result;
    }

    private void solve(ArrayList<Integer> arr, int n, int idx, int currentSum, ArrayList<Integer> result) {
        if (idx == n) {
            result.add(currentSum);
            return;
        }
        
        solve(arr, n, idx + 1, currentSum + arr.get(idx), result);
        solve(arr, n, idx + 1, currentSum, result);
    }
}
