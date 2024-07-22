public class Solution {
    
    // Main function to return the shortest common supersequence string
    public String shortestCommonSupersequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Initialize dp array
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        // Fill the dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Construct the SCS string
        StringBuilder scs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                scs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                scs.append(s1.charAt(i - 1));
                i--;
            } else {
                scs.append(s2.charAt(j - 1));
                j--;
            }
        }

        // Add remaining characters from s1 or s2
        while (i > 0) {
            scs.append(s1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            scs.append(s2.charAt(j - 1));
            j--;
        }

        return scs.reverse().toString();
    }

    // Helper function with memoization (not used here but can be useful for length calculation)
    public int solve(String s1, String s2, int i, int j, int[][] dp) {
        if (i == s1.length()) {
            return s2.length() - j;
        }
        if (j == s2.length()) {
            return s1.length() - i;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + solve(s1, s2, i + 1, j + 1, dp);
        } else {
            dp[i][j] = 1 + Math.min(solve(s1, s2, i + 1, j, dp), solve(s1, s2, i, j + 1, dp));
        }

        return dp[i][j];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abac";
        String s2 = "cab";
        String scs = solution.shortestCommonSupersequence(s1, s2);
        System.out.println("Shortest Common Supersequence: " + scs);
    }
}
