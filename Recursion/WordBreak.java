import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Boolean[][] memo = new Boolean[n][n];
        return wordBreakHelper(s, wordDict, 0, memo);
    }

    private boolean wordBreakHelper(String s, List<String> wordDict, int start, Boolean[][] memo) {
        if (start == s.length()) {
            return true;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (memo[start][end - 1] != null) {
                if (memo[start][end - 1]) {
                    return true;
                }
            } else {
                if (wordDict.contains(s.substring(start, end)) && wordBreakHelper(s, wordDict, end, memo)) {
                    memo[start][end - 1] = true;
                    return true;
                } else {
                    memo[start][end - 1] = false;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        boolean result = solution.wordBreak(s, wordDict);
        System.out.println(result); // Output: true
    }
}
